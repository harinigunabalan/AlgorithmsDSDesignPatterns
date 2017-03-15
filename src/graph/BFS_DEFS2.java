package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by d063995 on 14/03/2017.
 */
public class BFS_DEFS2 {

    Queue<GraphNode2> q = new LinkedList<>();

    public void BFS(GraphNode2 node){

        if(node == null)
            return;
        else{
            if(node.state == GraphNode2.State.NOT_VISITED){
                System.out.println(node.vertex_name);
                node.state = GraphNode2.State.VISITED;
            }
            for(Iterator i = node.children.iterator(); i.hasNext();) {
                GraphNode2 curr = (GraphNode2)i.next();
                if(curr.state == GraphNode2.State.NOT_VISITED && !q.contains(curr))
                    q.add(curr);
            }
            if(!q.isEmpty()){
                BFS(q.remove());
            }
        }
    }

    public void DFS(GraphNode2 node){
        if(node == null)
                return;
        if(node.state == GraphNode2.State.NOT_VISITED){
            System.out.println(node.vertex_name);
            node.state = GraphNode2.State.VISITED;
        }
        if(node.children.size() != 0 ){
            for(Iterator i = node.children.iterator(); i.hasNext();) {
                GraphNode2 curr = (GraphNode2)i.next();
                if(curr.state == GraphNode2.State.NOT_VISITED)
                    DFS(curr);
            }
        }
    }

    public static void main(String[] args) {

        GraphNode2 node1 = new GraphNode2("A1");
        GraphNode2 node2 = new GraphNode2("A2");
        GraphNode2 node3 = new GraphNode2("B1");
        GraphNode2 node4 = new GraphNode2("B2");
        GraphNode2 node5 = new GraphNode2("B3");
        GraphNode2 node6 = new GraphNode2("C1");
        GraphNode2 node7 = new GraphNode2("C2");

        node1.children.add(node2);
        node1.children.add(node3);
        node1.children.add(node6);

        node2.children.add(node1);
        node2.children.add(node3);
        node2.children.add(node6);

        node3.children.add(node4);
        node3.children.add(node5);

        node4.children.add(node3);
        node4.children.add(node5);

        node6.children.add(node7);

        node7.children.add(node6);

        BFS_DEFS2 o = new BFS_DEFS2();
       // o.DFS(node1);

        o.BFS(node1);

    }

}
