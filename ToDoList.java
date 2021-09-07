import java.util.ArrayList;

public class ToDoList {
    
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<String>();
    }
    
    // Adds a task to the list
    public void addTask(String task) {
        tasks.add(task);
    }

    // Delete a task from the list by name
    public void deleteTaskName(String task) {
        tasks.remove(task);
    }

    // Delete a task from the list by index
    public void deleteTaskNumber(int index) {
        tasks.remove(index);
    }

    // Returns list of tasks
    public String toString() {
        String result = "To Do\n";
        for (String task : tasks) {
            result += task + "\n";
        }
        return result;
    }

    // Returns the size of the list
    public int getSize() {
        return tasks.size();
    }

}