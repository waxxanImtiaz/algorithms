package trees;

import java.util.Hashtable;
import java.util.Map;

public class InsertBinaryTree {
    static Node insert(Node root,int data){
        if (root == null){
            root = new Node();
            root.data = data;
            return root;
        }
        if (root.data > data){
            root.left = insert(root.left,data);
        }else
            root.right = insert(root.right, data);

        return root;
    }

    public static void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root,50);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,100);
        root = insert(root,10);
        root = insert(root,70);
        root = insert(root,80);
        root = insert(root,60);

        inOrder(root);

    }
}
