package LinkedList.Singly_LinkedList;

public class OurLinkedList<T> {

    Node headNode;

    public OurLinkedList() {
        headNode = null;
    }

    public void add(Object objValue) {
        Node newNode = new Node(objValue, null);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
    }

    public void delete() {
        headNode = headNode.next;
    }

    public void display() {
        Node n = headNode;
        while (!(n == null)){
            System.out.println(n.value);
            n = n.next;
        }
    }
}
