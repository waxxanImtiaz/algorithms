package graphs.test;

public class GraphFunctionsTest {
    public static void connectNodes(MyGraphNode node1, MyGraphNode node2){
        node1.addNeighbors(node2);
        node2.addNeighbors(node1);
    }
    public static MyGraphNode createGraph(){
        MyGraphNode node1 = new MyGraphNode(3);
        MyGraphNode neighbour1 = new MyGraphNode(1);
        MyGraphNode neighbour2 = new MyGraphNode(2);
        node1.addNeighbors(neighbour1);
        node1.addNeighbors(neighbour2);

        MyGraphNode node2 = new MyGraphNode(8);
        MyGraphNode neighbour3 = new MyGraphNode(5);
        MyGraphNode neighbour4 = new MyGraphNode(3);

        node2.addNeighbors(neighbour3);
        node2.addNeighbors(neighbour4);
        return node1;
    }
    public static  void DFS(MyGraphNode node,int data){
        if (node == null)
            return;

        if (node.getData() == data) {
            System.out.println("DFS found the GraphNode with desired data: " + node.getData());
            return;
        }

        for (MyGraphNode node1 : node.getNeighbors()){
            if (!node1.isVisited()){
                node1.markVisited();
                DFS(node1,data);
            }
        }
    }
}
