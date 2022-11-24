package part3.main.java.dao;
import part3.main.java.Model.TodoItem;
import java.util.List;
public interface TodoItemDao  {
    List<TodoItem> findAllAvailable();
    List<TodoItem> findExpiredAndInCompleted();
}
