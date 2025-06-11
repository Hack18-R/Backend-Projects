package To_Do_List;

import java.util.ArrayList;

public class TaskManager {

    // Declaration and Initialization of instance variable
    private ArrayList<Task> tasks = new ArrayList<>();

    // Adding the Task Method
    public void addTask(String name) {
        tasks.add(new Task(name));
    }

    // View the Tasks
    public void viewTaskS() {
        if (tasks.isEmpty()) {
            System.out.println("No taska available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Mark the task as Done
    public void markTaskDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markDone();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Delete the Task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number");
        }
    }
}
