// github.com/RodneyShag

package graphs;


public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test DFS\n");
        GraphNode graphNode = GraphFunctions.createGraph();
        GraphFunctions.DFS(graphNode, 3); // searches for value 6
    }
}
