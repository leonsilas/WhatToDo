public class WhatToDo {

    public static void main(String args[]) {
        
        // Create a todo list
        ToDoList todo = new ToDoList();

        // Add some tasks
        todo.addTask("Buy milk");
        todo.addTask("Buy eggs");
        todo.addTask("Buy bread");
        todo.addTask("Buy cheese");
        todo.addTask("Buy butter");
        todo.addTask("Buy jam");

        // Print the list
        System.out.println(todo.toString());

        // Delete the first task
        todo.deleteTask(0);

        // Print the list
        System.out.println(todo.toString());

        // Delete the last task
        todo.deleteTask(todo.getSize() - 1);

        // Print the list
        System.out.println(todo.toString());
    
        // Remove buy cheese task
        todo.removeTask("Buy cheese");

        // Print the list
        System.out.println(todo.toString());
                
    }// End of main

}// End of WhatToDo