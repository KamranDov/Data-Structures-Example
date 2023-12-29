package LinkedList.Circular_LinkedList;

public class Node {
    int data;
    Node next;

    public static boolean isCircular(Node head) {
        if (head == null)
            return true;

        Node node = head.next;
        while (node != null && node != head)
            node = node.next;
        return (node == head);
    }

    public static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
}
