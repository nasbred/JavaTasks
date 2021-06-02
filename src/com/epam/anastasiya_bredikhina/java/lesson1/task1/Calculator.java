package com.epam.anastasiya_bredikhina.java.lesson1.task1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
    public void runCalculator(){
        int A, B;
        String answer;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            A = scanner.nextInt();
            System.out.println("Enter second number");
            B = scanner.nextInt();
            System.out.println("Choose operation. " +
                    "Enter 1 for +, 2 for -, 3 for *, 4 for /");
            int operation = scanner.nextInt();
            Calculator calculator = new Calculator();
            switch (operation) {
                case 1:
                    calculator.add(A, B);
                    break;
                case 2:
                    calculator.subtract(A, B);
                    break;
                case 3:
                    calculator.multiply(A, B);
                    break;
                case 4:
                    calculator.divide(A, B);
                    break;
                default:
                    System.out.println("You entered incorrect operation");
            }
        }
        catch (Exception e){
            System.out.println("OOps! Something went wrong!");
        }
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void subtract(int a, int b){
        System.out.println(a-b);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void divide(int a, int b){
        System.out.println(a/b);
    }
}
