package part3.main.java.Dao.impl.sequencer;

public class TodoItemTaskIdSequencer {
    private static int sequencer = 10000;

    public static int nextId() {
        return ++sequencer;
    }
}
