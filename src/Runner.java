import java.util.ArrayList;

public class Runner {

	
	
	static int initAlpha = -1000;
	static int initBeta = 1000;
	static ArrayList<Node> visited = new ArrayList<Node>();
	static ArrayList<Node> ignored = new ArrayList<Node>();

	static Tree tree = new Tree();
	static Node root = tree.root;
	
	public static void main(String[] args) {
		

		BFS();
		System.out.println("Branching factor: "+ root.childNodes.size());
		System.out.println("Nodes Traversed");
		int max = alphaBeta(root, initAlpha, initBeta);

		System.out.println("Max Value: "+max);

			
		
	}
	
	static void BFS() {
		int childCount = root.childNodes.size();
		
		ArrayList<Node> opened = new ArrayList<>();
		ArrayList<String> order = new ArrayList<>();
		opened.add(root);
		while (!opened.isEmpty()) {
			Node toOpen = opened.remove(0);
			order.add(toOpen.name);
			if (toOpen.childNodes != null) {
				opened.addAll(toOpen.childNodes);
			}
		}
		int row = 0;
		while(!order.isEmpty()) {
			for(int i = 0; i < Math.pow(childCount,row); i++) {
				System.out.print(" "+order.remove(0)+" ");
			}
			System.out.println();
			row += 1;
		}
		
	}
	
	static int alphaBeta(Node root, int alpha, int beta) {
		
		if (root.childNodes == null) {
			System.out.println(root.value);
			visited.add(root);
			
			return root.value;
		}
		
		if (root.maximizer) {
			System.out.println(root.name);

			int best = initAlpha;
			
			for (Node child: root.childNodes) {
				
				int val = alphaBeta(child, alpha, beta);
				best = Math.max(best, val);
				alpha = Math.max(alpha, best);
				
				if ((alpha >= beta)) {
					
					break;
				}
			}
			return best;
			
		} else {
			System.out.println(root.name);

			int best = initBeta;
			
			for (Node child: root.childNodes) {

				int val = alphaBeta(child, alpha, beta);
				best = Math.min(best, val);
				beta = Math.min(beta, best);
				
				if ((alpha >= beta)) {
					break;
				} 
			}
			
			return best;
		}
		
	}
}
