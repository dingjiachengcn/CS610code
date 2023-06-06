import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("Enter a command (push, pop, peek, display, exit):");
            String command = scanner.next().toLowerCase();

            if (command.equals("push")) {
                System.out.println("Enter the element to push:");
                int element = scanner.nextInt();
                stack.push(element);
                System.out.println(stack);
            } else if (command.equals("pop")) {
                if (!stack.isEmpty()) {
                    int poppedElement = stack.pop();
                    System.out.println("Popped element: " + poppedElement);
                    System.out.println(stack);
                } else {
                    System.out.println("Stack is empty. Cannot pop.");
                }
            } else if (command.equals("peek")) {
                if (!stack.isEmpty()) {
                    int topElement = stack.peek();
                    System.out.println("Top element: " + topElement);
                } else {
                    System.out.println("Stack is empty. Nothing to peek.");
                }
            } else if (command.equals("display")) {
                System.out.println(stack);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}

