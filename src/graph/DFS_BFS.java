package graph;

import java.util.LinkedList;
import java.util.Queue;

import graph.GraphNode.State;

public class DFS_BFS {
	
	public void DFS(GraphNode root){
		if (root == null) return;
		System.out.println(root.getVertex_name());
		root.state = State.VISITED;
		GraphNode[] children = root.getChildren();
		for(GraphNode child: children){
			if(child.state == State.NOT_VISITED){
				DFS(child);
			}	
		}
	}
	
	public void BFS(GraphNode root){
		
		if(root != null)
			if(root.state == State.NOT_VISITED){
				root.state = State.VISITED;
				System.out.println(root.getVertex_name());
			}
		else return;
		
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		
		for(GraphNode child : root.getChildren()){
			queue.add(child);
		}
		while(!queue.isEmpty()){
			GraphNode visiting = queue.poll();
			if(visiting.state == State.NOT_VISITED){
				visiting.state = State.VISITED;
				System.out.println(visiting.getVertex_name());
				GraphNode[] children = visiting.getChildren();
				for(GraphNode child : children){
					queue.add(child);
				}
			}
		}
	}

	public static void main(String[] args){
		
		GraphNode node1 = new GraphNode("A1", 3);
		GraphNode node2 = new GraphNode("A2", 3);
		GraphNode node3 = new GraphNode("B1", 2);
		GraphNode node4 = new GraphNode("B2", 2);
		GraphNode node5 = new GraphNode("B3", 0);
		GraphNode node6 = new GraphNode("C1", 1);
		GraphNode node7 = new GraphNode("C2", 1);
		
		node1.addChildNode(node2);
		node1.addChildNode(node3);
		node1.addChildNode(node6);
		
		node2.addChildNode(node1);
		node2.addChildNode(node3);
		node2.addChildNode(node6);
		
		node3.addChildNode(node4);
		node3.addChildNode(node5);
		
		node4.addChildNode(node3);
		node4.addChildNode(node5);
		
		node6.addChildNode(node7);
		node7.addChildNode(node6);
		
		DFS_BFS obj = new DFS_BFS();
		// obj.DFS(node1);
		
		System.out.println("BFS:");
		obj.BFS(node1);
		
	}
}
