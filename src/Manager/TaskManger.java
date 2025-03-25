import resources.Status;
import resources.Task;

public class TaskManger {

    static int ID = 1;


   int GetNextID(){
       return  ID++;
   }


    public  void StatusUpdate(Task task) {


        if( task.getStatus().equals(Status.NEW)){
            task.setStatus(Status.IN_PROGRESS);
            
        }
    }

}


