package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void viewTasksSortedByCreationDate() {
        Collections.sort(tasks, Comparator.comparing(Task::getCreationDate));
        for (Task task : tasks) {
            System.out.println("Название: " + task.getTitle());
            System.out.println("Описание: " + task.getDescription());
            System.out.println("Дата создания: " + task.getCreationDate());
            System.out.println();
        }
    }


    private static int taskCount;

    public static int getTaskCount() {
        return taskCount;
    }

    public static void incrementTaskCount() {
        taskCount++;
    }
}