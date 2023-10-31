package core;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Создание классов
        Task task1 = new Task("Задача 1", "Описание 1", "2022-01-01");
        Task task2 = new DeadlineTask("Задача 2", "Описание 2", "2022-01-02", "2022-01-10");
        Task task3 = new RecurringTask("Задача 3", "Описание 3", "2022-01-03", "еженедельно", "2022-01-05");

        // добавление в TaskManager
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        // Показать задачи
        taskManager.viewTasksSortedByCreationDate();



        task1.setTitle("Обновленое название Первой задачт");
        task1.setDescription("Обновленое описание первой задачи");


        System.out.println("1 Задача, название " + task1.getTitle());
        System.out.println("Описание 1 задача " + task1.getDescription());



    }
}