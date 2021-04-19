package graphs.test;

/*
* 1--3----8---5
*    !    !
*    2    3
*
* */
public class MyTester {
    public static void main(String[] args) {
        MyGraphNode graph = GraphFunctionsTest.createGraph();
         GraphFunctionsTest.DFS(graph,8);

    }
}
