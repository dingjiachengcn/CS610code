import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("Enter a command (add, delete, update, find, display, exit):");
            String command = scanner.next().toLowerCase();

            if (command.equals("add")) {
                System.out.println("Enter the element to add:");
                int element = scanner.nextInt();
                arr = addElement(arr, element);
                System.out.println(Arrays.toString(arr));
            } else if (command.equals("delete")) {
                System.out.println("Enter the index of the element to delete:");
                int index = scanner.nextInt();
                arr = deleteElement(arr, index);
                System.out.println(Arrays.toString(arr));
            } else if (command.equals("update")) {
                System.out.println("Enter the index of the element to update and the new value:");
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                arr = updateElement(arr, index, value);
                System.out.println(Arrays.toString(arr));
            } else if (command.equals("find")) {
                System.out.println("Enter the element to find:");
                int element = scanner.nextInt();
                int index = findElement(arr, element);
                if (index != -1) {
                    System.out.println("Element found at index " + index);
                } else {
                    System.out.println("Element not found");
                }
            } else if (command.equals("display")) {
                System.out.println(Arrays.toString(arr));
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }

    private static int[] addElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }

    private static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return newArr;
    }

    private static int[] updateElement(int[] arr, int index, int value) {
        arr[index] = value;
        return arr;
    }

    private static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
