package LinkedList.Doubly_LinkedList;

public class DoublyLinkedList {


    public static void main(String[] args) {

        Node dList = new Node();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //Displays the nodes present in the list
        dList.display();
    }
}
