package todoapp;

import java.util.ArrayList;
import java.util.Scanner;

public class todoapp {

    public static ArrayList<Task> tasks = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> functions.addtask();
                case 2 -> functions.viewtasks();
                case 3 -> functions.marksdone();
                case 4 -> functions.deletetask();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
