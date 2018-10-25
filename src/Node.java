import java.util.ArrayList;

public class Node {
	
	int value;
	boolean maximizer = true;
	ArrayList<Node> childNodes = null;
	Node parent = null;
	
	String name;
	
	public Node(String name, boolean maximizer, ArrayList<Node> childNodes) {
		this.maximizer = maximizer;
		if (maximizer) {
			value = -1000;
		} else {
			value = 1000;
		}
		
		this.childNodes = childNodes; 
		this.name = name;
		
		for (Node child: childNodes) {
			child.parent = this.parent;
		}
	}
	

	public Node(int value) {
		this.value = value;
		name = ""+value+"";
	}
	
}
