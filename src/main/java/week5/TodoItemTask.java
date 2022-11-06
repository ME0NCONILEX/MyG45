package week5;

public class TodoItemTask {

    private String task;
    private int priority;
    private int getExpl;
    private int id;

    private int todoItem;

    public TodoItemTask(String task, int priority, int getExpl) {
        this.task = task; // Description of the task
        this.priority = priority; // 1 = very important, 2 = important, 3 = unimportant, 4 = after learn
        // Java
        this.getExpl = getExpl;
        this.todoItem = todoItem; // amount of time to complete the task

    }

    public String getPriority(String translation) {
        if (priority == 1) {
            translation = "very important";
        }
        if (priority == 2) {
            translation = " important";
        }
        if (priority == 3) {
            translation = "unimportant";
        }
        if (priority == 4) {
            translation = " after learn German";
        }
        return translation;
    }

    public String toString() {
        String translation = "";
        return task + " takes " + getExpl + " minutes and has priority " + getPriority(translation);
    }
}
