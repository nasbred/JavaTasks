package com.epam.anastasiya_bredikhina.java.lesson1.task1;

import java.util.Arrays;

public class BeautifulArray {//Задача 1.2, 1.3

    private int[] array = new int[20];

    public void runArrayOperations(){
        setOriginalArray();
        getSumOfEvenElements();
        setNegativeElementsToZero();
    }

    private void setOriginalArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*21)-10;
        }
        System.out.println("Original array: " + Arrays.toString(array));
    }

    private void getSumOfEvenElements(){
        //2.В массиве целых чисел определить сумму элементов, состоящих на
        //чётных позициях
        int sum = 0;
        for (int i = 0; i < array.length; i = i+2) {
            sum += array[i];
        }
        System.out.println("Sum of even elements:" + sum);
    }

    private void setNegativeElementsToZero(){
        //3.В массиве целых чисел заменить нулями отрицательные элементы.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(array));
    }

}