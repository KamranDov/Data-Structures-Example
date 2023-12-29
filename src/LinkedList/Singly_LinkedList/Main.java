package LinkedList.Singly_LinkedList;

public class Main {
    public static void main(String[] args) {

        OurLinkedList<String> linkedList = new OurLinkedList<>();
        linkedList.add("Nihad");
        linkedList.add("Vahid");
        linkedList.add("Selim");
        linkedList.display();
        System.out.println("show list----------------\n");

        linkedList.delete();
        System.out.println("first element deleted...");
        linkedList.display();

        System.out.println("show list----------------\n");
        linkedList.delete();
        System.out.println("second element deleted...");
        linkedList.display();
    }

}
