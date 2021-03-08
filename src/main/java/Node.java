public class Node {
    private int value;
    private Node left;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
