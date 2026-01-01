package todoapp;

public class Task {
    private final String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean checkStatus() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }
}