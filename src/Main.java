import Manager.TaskManger;
import resources.Task;

public class Main {
    public static void main(String[] args){
    TaskManger taskManger = new TaskManger();
    Task task = new Task("test","tester");
        System.out.println(task);

        taskManger.addTask(task);
        System.out.println(task);
        // здесь так же непонятный момент, мы не присваеваем обьекту имя. и получается задача
        // сразу создается внутри хешмапы
        taskManger.addTask(new Task("test2","tester2"));
        taskManger.addTask(new Task("test3","tester3"));
        System.out.println();
        taskManger.printTasks();
        task.setDescription("обновлено");
        taskManger.updateTask(task);
        taskManger.printTasks();
        System.out.println();
        taskManger.deleteTaskByID(2);
        taskManger.printTasks();
        System.out.println();
        taskManger.addTask(new Task("test4","tester4"));
        taskManger.addTask(new Task("test5","tester5"));
      Task task4test = new Task("test4test","а что будет если принудительно создать задачу с существующим айди",4);

      taskManger.addTask(task4test);
        taskManger.addTask(new Task("test6","tester6"));
        taskManger.printTasks();
        System.out.println();
        System.out.println(taskManger.getAllTask());



    }




}