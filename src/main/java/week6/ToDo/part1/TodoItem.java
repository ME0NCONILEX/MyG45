package week6.Todo.part1;

import java.util.ArrayList;

public class TodoItem {
        ArrayList<TodoItemTask> Todo = new ArrayList<>(); // ArrayList of Tasks
        public void addTask(String description, int priority, int minutes) {
            if (priority > 4 || priority < 1) {
                System.out.println(description + " has invalid priority ");
            }

            if (minutes < 0) {
                System.out.println(description + " has invalid workload ");
            }
            Todo.add(new TodoItemTask(description, priority,minutes));   // Add Task
        }
        public void getTodoList() {
            // Iterate over Todo ArrayList
            for (TodoItemTask task : Todo){
                System.out.println(task);
            }
        }
        public void print() {
            System.out.println("=====");
            System.out.println("Todo: ");
            System.out.println("=====");
            getTodoList();
            if (Todo == null) {
                System.out.println("You're all done for today! #TodoZero");
            }
        }
        public static void main(String[] args) {
            TodoItem todo;
            todo = new TodoItem();
            todo.addTask("Java exercises", 1, 120);
            todo.addTask("Java lecture", 2, 90);
            todo.print();
            System.out.print("");
        }
    }

