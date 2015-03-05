package com.idodevjobs;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Task> taskList = Arrays.asList(
                                        new Task("Task A", Task.Priority.NEW),
                                        new Task("Task B", Task.Priority.COMPLETE),
                                        new Task("Task C", Task.Priority.PROGRESS));
        System.out.println(taskList.stream().filter((Task t) -> (t.getPriority().equals(Task.Priority.COMPLETE))).count());
        taskList.stream().map((t) -> (t.getName())).forEach((s) -> {System.out.println(s);});
        System.out.println(Arrays.deepToString(taskList.stream().map(t -> t.getName() + " - " + t.getPriority()).toArray(l -> new String[l])));
    }
}

class Task {
    private String name;
    private Priority priority;

    public Task() {}

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Priority getPriority() {
        return priority;
    }

    enum Priority {
        NEW, PROGRESS, COMPLETE
    }
}
