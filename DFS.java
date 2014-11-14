import java.util.*;

public class DFS {
	
	public static boolean dfs(Graph g, Node src, Node dest) {
		src.marked = true;
		if(src == dest)
			return true;
		else {
			for(Node u : src.getAdjacent()) {
				if(!u.marked && dfs(g, u, dest)) 
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Graph g = new Graph();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i = 0; i < n; i++)
			g.nodes.add(new Node(i));

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			g.nodes.get(a).adj.add(g.nodes.get(b));
		}

		for(int i = 0; i < n; i++) {
			Node u = g.nodes.get(i);
			System.out.print(u + ": ");
			for(Node v : u.getAdjacent())
				System.out.print(v + " ");
			System.out.println();
		}

	}
}


