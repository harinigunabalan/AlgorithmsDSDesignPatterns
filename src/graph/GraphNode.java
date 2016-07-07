package graph;

public class GraphNode {

	String vertex_name;
	public enum State{
		VISITED, VISITING, NOT_VISITED,
	}
	State state;
	GraphNode[] children;
	int childCount = 0;
	
	public GraphNode(String vertex, int children_count){
		this.vertex_name = vertex;
		this.childCount = 0;
		this.children = new GraphNode[children_count];
		this.state = State.NOT_VISITED;
	}
	
	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	
	public void addChildNode(GraphNode adj){
		this.children[childCount] = adj;
		childCount++;
	}
	
	public String getVertex_name() {
		return vertex_name;
	}
	public void setVertex_name(String vertex_name) {
		this.vertex_name = vertex_name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public GraphNode[] getChildren() {
		return children;
	}
	public void setChildren(GraphNode[] children) {
		this.children = children;
	}
	
}
