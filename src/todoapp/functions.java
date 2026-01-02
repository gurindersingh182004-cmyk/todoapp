package todoapp;



public class functions {
    
    public static void addtask( String description) {
        System.out.println("name the task you want: ");
        String name = todoapp.scanner.nextLine();
        todoapp.tasks.add( new Task(name));
        
    }

}
