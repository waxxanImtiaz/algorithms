package graphs.test;

import java.util.ArrayList;
import java.util.List;

public class MyGraphNode {
    private int data;
    private boolean visited;
    private List<MyGraphNode> neighbors;
    public MyGraphNode(int data){
        this.data = data;
        neighbors = new ArrayList<>();
        visited = false;
    }

    public void addNeighbors(MyGraphNode graphNode){
        this.neighbors.add(graphNode);
        graphNode.addNeighbors(this);
    }
    public int getData() {
        return data;
    }
    public void markVisited(){
        visited = true;
    }
    public boolean isVisited() {
        return visited;
    }

    public List<MyGraphNode> getNeighbors() {
        return neighbors;
    }
}
