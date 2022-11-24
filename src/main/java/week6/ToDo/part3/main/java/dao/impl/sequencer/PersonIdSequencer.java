package part3.main.java.dao.impl.sequencer;

public class PersonIdSequencer {

    private static int sequencer = 100;

    public static int nextId() {
        return ++sequencer;
    }
}
