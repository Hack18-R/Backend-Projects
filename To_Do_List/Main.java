package To_Do_List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // TaskManager object
        TaskManager manager = new TaskManager();

        // Attribute
        int choice;

        // Menu for To-DO list
        do {
            System.out.println("---TO-DO-List Menu---");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            choice = scan.nextInt();
            scan.nextLine();

            // Cases to select operations for To-DO list
            switch (choice) {
                case 1:
                    System.out.println("Enter task name: ");
                    String task = scan.nextLine();
                    manager.addTask(task);
                    break;
                case 2:
                    manager.viewTaskS();
                    break;
                case 3:
                    System.out.println("Enter task number to mark as done: ");
                    int dobeIndex = scan.nextInt();
                    manager.markTaskDone(dobeIndex);
                    break;
                case 4:
                    System.out.println("Enter task number to delete: ");
                    int delIndex = scan.nextInt();
                    manager.deleteTask(delIndex);
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
