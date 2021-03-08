package linkedlist;

public class LinearLinkedList {
    public Node linkedList;

    public LinearLinkedList() {
        Node head = new Node();
        for (int i = 1; i < 10; i++) {
            Node newNode = new Node();
            newNode.value = i;
            head = insert(head, newNode);
        }

        linkedList = head;
    }

    public Node insert(Node head, Node nodeToInsert) {
        Node temp = head;

        while (temp != null) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }

        temp.next = nodeToInsert;
        return head;
    }

    public void printList(Node head) {
        if (head == null)
            return;
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.value + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getMiddleNodeValue() {
        int size = getSizeOfList(linkedList);

        int index = 0;

        Node temp = linkedList.next;
        while (temp != null) {
            if (index == size / 2)
                return temp.value;
            index++;
            temp = temp.next;
        }
        return 0;
    }

    public int getMiddleElementByTwoPointers() {
        Node fastPtr = linkedList;
        Node slowPtr = linkedList;

        if (linkedList == null)
            return 0;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.value;


    }

    public int getSizeOfList(Node head) {
        int count = 0;
        if (head == null)
            return 0;
        Node temp = head.next;

        while (temp != null) {
            count++;
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
        System.out.println();
        return count;
    }

    public void printInReverse(Node head) {
        if (head == null)
            return;
        if (head.next != null) {
            printInReverse(head.next);
        }
        if (head.value != null)
            System.out.println(head.value);
    }

    void printAlternate(Node head) {
        if (head == null) {
            return;
        }
        if (head.value != null)
            System.out.print(head.value + " ");

        if (head.next != null) {
            printAlternate(head.next.next);
        }
        if (head.value != null)
            System.out.print(head.value + " ");
    }

    public static void main(String[] args) {
        LinearLinkedList linearLinkedList = new LinearLinkedList();
//        System.out.println(linearLinkedList.getMiddleNodeValue());
        linearLinkedList.printList(linearLinkedList.linkedList);

//        System.out.println(linearLinkedList.getMiddleElementByTwoPointers());

//        linearLinkedList.printAlternate(linearLinkedList.linkedList);


    }
}
