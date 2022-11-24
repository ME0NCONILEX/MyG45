package part3.main.java.dao.impl.sequencer;

public class PersonIdSequencer {
    private static int personIdSequencer;

    static {
        personIdSequencer = 100;
    }
    public static int nextId() {
        return ++personIdSequencer;
    }
}


// to be reworked!
/*    private final int id;
    private String title;
    private String taskDescription;
    LocalDate deadline;
    private boolean done;
    private Person creator;

    public PersonIdSequencer(String title, String taskDescription, LocalDate deadline, boolean done, Person creator) {
        this.id = personIdSequencer++;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;
    }

    public static int nextId() {
        return 0;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TodoItem todoItem = (TodoItem) object;
        return id == todoItem.getId() && done == todoItem.isDone() && Objects.equals(title, todoItem.getTitle()) && Objects.equals(taskDescription, todoItem.getTaskDescription()) && Objects.equals(deadline, todoItem.getDeadline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadline, done);
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(deadline);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Not allowed to be null ");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline == null) throw new IllegalArgumentException("Not allowed to be null ");
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    } */
