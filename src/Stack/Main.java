package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> animals1 = new Stack<>();

        // Add elements to Stack with push() method
        animals1.push("Dog");
        animals1.push("Horse");
        animals1.push("Cat");

        System.out.println("Stack: " + animals1);

        //----------------------------------------------------------------------------------
        Stack<String> animals2 = new Stack<>();

        // Add elements to Stack with push() method
        animals2.push("Dog");
        animals2.push("Horse");
        animals2.push("Cat");
        System.out.println("Initial Stack: " + animals2);

        // Remove element stacks with pop() method
        String element1 = animals2.pop();
        System.out.println("Removed Element: " + element1);

        //----------------------------------------------------------------------------------

        Stack<String> animals3 = new Stack<>();

        // Add elements to Stack with push() method
        animals3.push("Dog");
        animals3.push("Horse");
        animals3.push("Cat");
        System.out.println("Stack: " + animals3);

        // Access element from the top with peek() method
        String element2 = animals3.peek();
        System.out.println("Element at top: " + element2);

        //----------------------------------------------------------------------------------

        Stack<String> animals4 = new Stack<>();

        // Add elements to Stack with push() method
        animals4.push("Dog");
        animals4.push("Horse");
        animals4.push("Cat");
        System.out.println("Stack: " + animals4);

        // Search an element with search() method
        int position = animals4.search("Horse");
        System.out.println("Position of Horse: " + position);

        //----------------------------------------------------------------------------------

        Stack<String> animals = new Stack<>();

        // Add elements to Stack with push() method
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Check if stack is empty with empty() method
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
