package graph;

import java.util.ArrayList;
import java.util.List;
public class GraphNode2 {

	String vertex_name;
	public enum State{
		VISITED, VISITING, NOT_VISITED,
	}
	State state;
	List<GraphNode2> children = new ArrayList<>();

	public GraphNode2(String vertex, int children_count){
		this.vertex_name = vertex;;
		this.state = State.NOT_VISITED;
	}
	
	/* public int getChildCount() {
		return childCount;
	} */

/*	public void setChildCount(int childCount) {
		this.childCount = childCount;
	} */
	
	public void addChildNode(GraphNode2 adj){
		children.add(adj);
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
	public List<GraphNode2> getChildren() {
		return children;
	}
	public void setChildren(List<GraphNode2> children) {
		this.children = children;
	}
	
}
