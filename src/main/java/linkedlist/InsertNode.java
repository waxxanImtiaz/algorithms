package linkedlist;

public class InsertNode {
    public static Node insertNodeAtPosition(Node head, int position, Node desiredNode) {
//        Node desiredNode = new Node(data);
        if (head == null) {
            head = desiredNode;
            return head;
        }
        Node temp = head;
        int posCount = 1;
        while (temp != null) {
            if (posCount == position) {
                /*==========INSERT NODE */
                Node thisNode = temp;
                desiredNode.next = thisNode.next;
                thisNode.next = desiredNode;
                break;
            }
            temp = temp.next;
            posCount++;
        }

        return head;
    }

    public static void print(Node head){
        Node temp = head.next;

        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }

    public static void printReverse(Node head){
        if (head == null)
            return;
        printReverse(head.next);
        System.out.print(head.value + " ");
    }
    public static void main(String[] args) {
        Node head = new Node();
        head = insertNodeAtPosition(head,1,new Node(11) );
        head = insertNodeAtPosition(head,2,new Node(9) );
        head = insertNodeAtPosition(head,3,new Node(19) );
        head = insertNodeAtPosition(head,4,new Node(10) );
        head = insertNodeAtPosition(head,5,new Node(4) );
//        head = insertNodeAtPosition(head,3,new Node(11) );
//        head = insertNodeAtPosition(head,4,new Node(16) );

        print(head);


        head = insertNodeAtPosition(head,3,new Node(20) );
        System.out.println();
        print(head);
    }
/*
*
*
*
* static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
         SinglyLinkedListNode desiredNode = new SinglyLinkedListNode(data);

        if (head == null) {
            head = desiredNode;
            return head;
        }
        SinglyLinkedListNode temp = head;
        int posCount = 1;
        while (temp != null) {
            if (posCount == position) {
                /*==========INSERT NODE */
//SinglyLinkedListNode thisNode = temp;
//    desiredNode.next = temp.next;
//    temp.next = desiredNode;
//                break;
//}
//            temp = temp.next;
//                    posCount++;
//                    }
//
//                    return head;
//
//                    }

}
