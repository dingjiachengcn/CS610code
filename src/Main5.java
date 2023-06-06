import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("Enter a command (enqueue, dequeue, peek, display, exit):");
            String command = scanner.next().toLowerCase();

            if (command.equals("enqueue")) {
                System.out.println("Enter the element to enqueue:");
                int element = scanner.nextInt();
                queue.add(element);
                System.out.println(queue);
            } else if (command.equals("dequeue")) {
                if (!queue.isEmpty()) {
                    int dequeuedElement = queue.remove();
                    System.out.println("Dequeued element: " + dequeuedElement);
                    System.out.println(queue);
                } else {
                    System.out.println("Queue is empty. Cannot dequeue.");
                }
            } else if (command.equals("peek")) {
                if (!queue.isEmpty()) {
                    int topElement = queue.peek();
                    System.out.println("First element: " + topElement);
                } else {
                    System.out.println("Queue is empty. Nothing to peek.");
                }
            } else if (command.equals("display")) {
                System.out.println(queue);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}
