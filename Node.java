import java.util.*;

public class Node {

	ArrayList<Node> adj;
	int element;
	boolean marked;

	public Node(int element) {
		adj = new ArrayList<>();
		this.element = element;
		marked = false;
	}

	public List<Node> getAdjacent() {
		return adj;
	}

	public String toString() {
		return element + "";
	}

}
