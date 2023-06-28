import java.util.Scanner;

public class Module5_Wianecki_Assignment1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        MyLinkedList list = new MyLinkedList();
        
        list.insertAtHead("James");
        list.insertAtTail("John");
        list.insertAtTail("Michael");
        list.insertAtTail("Peter");
        list.insertAtTail("Allison");
        list.insertAtTail("Daniel");
        list.insertAtTail("George");
        list.insertAtTail("Simon");
        list.insertAtTail("Jason");
        list.insertAtTail("Mark");
        
        System.out.println("Welcome to the List Program!");
        System.out.println("Enter a name or \"exit\" to exit: ");
        String userInput = keyboard.nextLine();
        
        while(!userInput.equals("exit")) {
            
            list.searchForElement(userInput);
            
            System.out.println("\n\n");
            System.out.println("Enter a name or \"exit\" to exit: ");
            userInput = keyboard.nextLine();
        }
        
        System.out.println("You have chosen to exit the program. See you later!");
        
    }
}