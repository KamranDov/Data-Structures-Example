package LinkedList.Circular_LinkedList;

import static LinkedList.Circular_LinkedList.Node.isCircular;
import static LinkedList.Circular_LinkedList.Node.newNode;

public class Main {
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        System.out.print(isCircular(head) ? "Yes\n" : "No\n");

        head.next.next.next.next = head;

        System.out.print(isCircular(head) ? "Yes\n" : "No\n");

    }
}
