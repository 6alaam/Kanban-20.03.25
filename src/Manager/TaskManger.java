package Manager;

import resources.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManger {
    // изначально присваевам id единицу
    private static int ID = 1;
    // создаем HashMap для тасков ,
    private final Map<Integer, Task> tasks = new HashMap<>();

    // данный метод присваивает новый айди с шагом +1.но в нем существует момент если задача в середине списка была удалена. то этот айди получается пропущен
    // в мейне создал пример такого момента
    public int getNextID() {
        return ID++;
    }

    // здесь мы создаем НОВЫЙ список со всем значениями хешмапы Тасков,
    public List<Task> getAllTask() {
        return new ArrayList<>(tasks.values());
    }

    //ну тут ясно удалили все из хешмапы
    public void deleteAllTask() {
        tasks.clear();

    }

    // тут ясно по айди найти задачу
    public Task getTaskId(int id) {
        return tasks.get(id);
    }

    // тут много вопросов , 1. по факту получается если мы создаем задачу по полному конструктору где руками пишем айди
    // то когда этот метод добавляеет ее в мапу с новым адйди следующим по порядку.
    // второе тут и проявляется методика добавления задачи, если д этого какойто айди был удален
    // он не заполнится, а будет присвоен следующий порядковый номер
    //да по условию метод должен возвращать этот добавленный обьект, но на данном этапе это бессмысленно
    public Task addTask(Task task) {
        task.setId(getNextID());
        tasks.put(task.getId(), task);
        return task;
    }

    // здесь тоже возникает вопрос , по заданию параметр это новая версия обьекта,
    // получется странная логика, по факту этод метод не апдейта задачи
    // а помещение уже измененной задчи в хешмапу тасков.
    public Task updateTask(Task task) {
        tasks.put(task.getId(), task);
        return task;
    }

    // тут понятно удалил по айди

    public void deleteTaskByID(int id) {
        tasks.remove(id);
    }

    // этот метод сделал исключительно для тестов в мейне . делал через неросетку

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач для отображения.");
            return;
        }

        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            Integer key = entry.getKey();
            Task task = entry.getValue();
            System.out.println("ID: " + key + ", " + task);
        }
    }
}





