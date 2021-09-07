public class WhatToDo {

    public static void main(String args[]) {
        
        // Create a todo list
        ToDoList todo = new ToDoList();

        // Add some tasks
        todo.addTask("Make A ToDoList Class");
        todo.addTask("Make it add items");
        todo.addTask("Make it delete items");
        todo.addTask("Delete items by name");
        todo.addTask("Drink a cold one");
        todo.addTask("Code some more");

        // Print the list 
        System.out.println(todo.toString());

        // Delete the first 3 tasks
        for (int i = 0; i < 3; i++) {
            todo.deleteTaskNumber(0);
        }

        // Print the list
        System.out.println(todo.toString());

        // Delete the last task
        todo.deleteTaskNumber(todo.getSize() - 1);

        // Print the list
        System.out.println(todo.toString());
    
        // Delete buy cheese task
        todo.deleteTaskName("Delete items by name");

        // Print the list
        System.out.println(todo.toString());
                
    }// End of main

}// End of WhatToDo