package trees;

public class BinaryTree {
    public static TreeNode insertLevelOrder(TreeNode root, int[] arr, int index) {
        if (index < arr.length) {
            TreeNode temp = new TreeNode();
            temp.setData(arr[index]);
            root = temp;

            root.setLeft(insertLevelOrder(root.getLeft(), arr, (2 * index + 1)));

            root.setRight(insertLevelOrder(root.getRight(), arr, 2 * index + 2));

        }
        return root;
    }

    public static void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public static int findHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int rightHeight = 0, leftHeight = 0;

        if (root.getLeft() != null)
            leftHeight = findHeight(root.getLeft());

        if (root.getRight() != null)
            rightHeight = findHeight(root.getRight());

        int max = Math.max(leftHeight, rightHeight);

        return max + 1;

    }

    public static TreeNode search(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.getData() == key) {
            System.out.println("Key found");
            return root;
        }
        if (root.getData() < key) {
            return search(root.getRight(), key);
        }
        return search(root.getLeft(), key);

    }

    public static void main(String[] args) {
        int[] arr = {50, 30, 20, 40, 70, 60, 80};

        TreeNode binaryTree = null;
//        for (int i = 0; i< arr.length; i++){
        binaryTree = insertLevelOrder(binaryTree, arr, 0);
//        }

        inOrder(binaryTree);

//        int height = findHeight(binaryTree);
//
//        System.out.println("\n Height = "+height);

//        System.out.println();
//        TreeNode node = search(binaryTree, 4);
//        if (node == null)
//            System.out.println("Not found");
//        else
//            System.out.println(node.getData());

    }


}
