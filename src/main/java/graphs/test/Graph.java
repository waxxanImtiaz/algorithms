package graphs.test;

public class Graph {
    private boolean adjMatrix[][];
    private int numVertices;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }
    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numVertices; i++){
            stringBuilder.append(i + ":");
            for (boolean j : adjMatrix[i]){
                stringBuilder.append(( j ? 1 : 0) + " ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);

        System.out.println(graph);

    }
}
