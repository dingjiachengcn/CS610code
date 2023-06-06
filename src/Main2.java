import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter a command (add, delete, update, find, display, exit):");
            String command = scanner.next().toLowerCase();

            if (command.equals("add")) {
                System.out.println("Enter the element to add:");
                int element = scanner.nextInt();
                list.add(element);
                System.out.println(list);
            } else if (command.equals("delete")) {
                System.out.println("Enter the index of the element to delete:");
                int index = scanner.nextInt();
                list.remove(index);
                System.out.println(list);
            } else if (command.equals("update")) {
                System.out.println("Enter the index of the element to update and the new value:");
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.set(index, value);
                System.out.println(list);
            } else if (command.equals("find")) {
                System.out.println("Enter the element to find:");
                int element = scanner.nextInt();
                int index = list.indexOf(element);
                if (index != -1) {
                    System.out.println("Element found at index " + index);
                } else {
                    System.out.println("Element not found");
                }
            } else if (command.equals("display")) {
                System.out.println(list);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}
