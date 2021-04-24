package com.personal.abhinavjdwij.tryout;

import java.util.UUID;

/*
* POC to implement enums using interface
* Use case :
* When Child Classes need to have different restricted values for a field
* Example:
* Task class can have child classes Bug and Feature
* Bug can have status as OPEN, CLOSED, etc, but Feature can have status as DESIGNED, IMPLEMENTED, etc
 */

enum ChildEnumA implements ParentEnum {
    OPEN("Open"),
    IN_PROGRESS("In Progress"),
    CLOSED("Closed");

    private String value;

    ChildEnumA(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}

enum ChildEnumB implements ParentEnum {
    NOT_STARTED("Not Started"),
    WIP("Work In Progress"),
    COMPLETED("Completed");

    private String value;

    ChildEnumB(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}

interface ParentEnum {
}

abstract class Task {
    String taskId;
    String taskName;
    ParentEnum taskStatus;

    public Task(String taskName, ParentEnum taskStatus) {
        this.taskId = UUID.randomUUID().toString();
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ParentEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(ParentEnum taskStatus) {
        this.taskStatus = taskStatus;
    }
}

class TaskTypeA extends Task {
    private String taskTypeAProperty;
    public TaskTypeA(String taskName, ChildEnumA taskStatus, String taskTypeAProperty) {
        super(taskName, taskStatus);
        this.taskTypeAProperty = taskTypeAProperty;
    }

    @Override
    public String toString() {
        return "TaskTypeA{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskStatus=" + taskStatus +
                ", taskTypeAProperty='" + taskTypeAProperty + '\'' +
                '}';
    }
}

class TaskTypeB extends Task {
    private String taskTypeBProperty;
    public TaskTypeB(String taskName, ChildEnumB taskStatus, String taskTypeBProperty) {
        super(taskName, taskStatus);
        this.taskTypeBProperty = taskTypeBProperty;
    }

    @Override
    public String toString() {
        return "TaskTypeB{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskStatus=" + taskStatus +
                ", taskTypeBProperty='" + taskTypeBProperty + '\'' +
                '}';
    }
}

public class EnumTryout {
    public static void main(String[] args) {
        ParentEnum enum1 = ChildEnumA.OPEN;
        ParentEnum enum2 = ChildEnumB.NOT_STARTED;
        System.out.println("enum1 : " + enum1);
        System.out.println("enum2 : " + enum2);
        Task task1 = new TaskTypeA("TaskA-1", ChildEnumA.IN_PROGRESS,"Task Type A Property 1");
        Task task2 = new TaskTypeB("TaskB-1", ChildEnumB.WIP, "Task Type B Property 1");
        System.out.println("task1 : " + task1);
        System.out.println("task2 : " + task2);
    }
}
