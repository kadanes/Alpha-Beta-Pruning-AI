import java.util.ArrayList;
import java.util.Arrays;

public class Tree {
	
	Node root;
	
	public Tree() {
		Node l1 = new Node(3);
		Node l2 = new Node(5);
		Node D = new Node("D",true,new ArrayList<>(Arrays.asList(l1,l2)));
		
		Node l3 = new Node(6);
		Node l4	 = new Node(9);
		Node E = new Node("E",true,new ArrayList<>(Arrays.asList(l3,l4)));
		
		Node B = new Node("B",false, new ArrayList<>(Arrays.asList(D,E)));
		
		
		Node l5 = new Node(1);
		Node l6 = new Node(2);
		Node F = new Node("F",true,new ArrayList<>(Arrays.asList(l5,l6)));
		
		Node l7 = new Node(0);
		Node l8	 = new Node(-1);
		Node G = new Node("G",true,new ArrayList<>(Arrays.asList(l7,l8)));
		
		Node C = new Node("C",false, new ArrayList<>(Arrays.asList(F,G)));
		
		Node A = new Node("A",true, new ArrayList<>(Arrays.asList(B,C)));
		
		root = A;
		
	}
	
}
