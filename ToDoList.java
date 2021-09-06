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

    // Removes a task from the list by name
    public void removeTask(String task) {
        tasks.remove(task);
    }

    // Delete a task from the list by index
    public void deleteTask(int index) {
        tasks.remove(index);
    }

    // Returns list of tasks
    public String toString() {
        String result = "";
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