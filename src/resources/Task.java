public class Task {

    String taskName ;
    String description;
    int id;
    Status status;

    public Task(String taskName, String description, int id,Status status) {
        this.taskName = taskName;
        this.description = description;
        this.id = id;
       this.status = status;

    }
}
