public class OrderLevelTraversalTree {

    public Node root;
    private int height(Node root){
        if (root == null)
            return 0;

        int lheight = height(root.getLeft());
        int rheight = height(root.getRight());

        if (lheight>rheight)
            return (lheight+1);
        return (rheight+1);

    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    private void printGivenLevel(Node tree,int level){
        if (tree == null)
            return;

        if (level == 1) {
            System.out.println(tree.getValue());
            return;
        }

        if (level>1)
        {
            printGivenLevel(tree.getLeft(),level-1);
            printGivenLevel(tree.getRight(),level-1);
        }

    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        OrderLevelTraversalTree tree = new OrderLevelTraversalTree();
        tree.root= new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft( new Node(4));
        tree.root.getLeft().setRight(new Node(5));

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
