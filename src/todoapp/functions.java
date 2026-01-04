package todoapp;



public class functions {
    
    public static void addtask() {
        System.out.println("name the task you want: ");
        String name = todoapp.scanner.nextLine();
        todoapp.tasks.add( new Task(name));
        
    }

    public static void viewtasks(){
        if (todoapp.tasks.get(0)== null){
            System.out.println("no tasks in hand");
        }
        for (int i = 0; i < todoapp.tasks.size(); i++){
            int no = i + 1;
            System.out.println(no + ":" + todoapp.tasks.get(i));

        }
    }

    public static void marksdone(){
        viewtasks();
        System.out.println("which task dp you want to make done: ");
        int no = todoapp.scanner.nextInt();
        todoapp.tasks.get(no-1).markAsCompleted();

    }

    public static void deletetask(){
        viewtasks();
        System.out.println("which task dp you want to make done: ");
        int no = todoapp.scanner.nextInt();
        todoapp.tasks.remove(no - 1);
    }


}
