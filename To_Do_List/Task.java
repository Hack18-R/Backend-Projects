package To_Do_List;

public class Task {

    // Attribute
    private String name;
    private boolean isDone;

    // Constructor
    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markDone() {
        this.isDone = true;
    }

    // toString
    public String toString() {
        return (isDone ? "[x]" : "[ ]") + name;
    }
}