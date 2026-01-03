package todoapp;



public class functions {
    
    public static void addtask( String description) {
        System.out.println("name the task you want: ");
        String name = todoapp.scanner.nextLine();
        todoapp.tasks.add( new Task(name));
        
    }

    public static void viewTasks(){
        if (todoapp.tasks.get(0)== null){
            System.out.println("no tasks in hand");
        }
        for (int i = 0; i < todoapp.tasks.size(); i++){
            int no = i + 1;
            System.out.println(no + ":" + todoapp.tasks.get(i));

        }
    }

    public static void marksdone(){
        viewTasks();
        System.out.println("which task dp you want to make done: ");
        int no = todoapp.scanner.nextInt();
        todoapp.tasks.get(no-1).markAsCompleted();

    }
}
