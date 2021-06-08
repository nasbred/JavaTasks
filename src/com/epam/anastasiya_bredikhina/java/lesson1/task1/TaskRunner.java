package com.epam.anastasiya_bredikhina.java.lesson1.task1;

public class TaskRunner {
    public static void main(String[] args) {
        TaskRunner taskRunner = new TaskRunner();
        taskRunner.runTasks();
    }
    public void runTasks(){
        System.out.println("Задание 1:");
        runArrayTask(); /*задание 1*/
        System.out.println("\nЗадание 2:");
        runStringTask();
        System.out.println("\nЗадание 3:");
        runCalculator();
    }
    public void runArrayTask(){
        BeautifulArray beautifulArray = new BeautifulArray();
        beautifulArray.runArrayOperations();
    }

    public void runStringTask(){
        BeautifulStrings beautifulStrings = new BeautifulStrings();
        beautifulStrings.runStringOperations();
    }

    public void runCalculator(){
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
}
