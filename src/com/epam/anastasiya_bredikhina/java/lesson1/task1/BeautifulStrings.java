package com.epam.anastasiya_bredikhina.java.lesson1.task1;

import java.util.Scanner;
import java.lang.String;

public class BeautifulStrings {

    private int numOfStrings;
    private Scanner scanner = new Scanner(System.in);

    public void runStringOperations(){
        try {
            getNumOfStrings();
            getStrings(numOfStrings);
        }
        catch (Exception e){
            System.out.println("OOps! Something went wrong!");
        }
    }

    private void getNumOfStrings(){
        System.out.println("Enter number of strings, you're going to enter");
        numOfStrings = scanner.nextInt();
    }

    private void getStrings(int i){
        int max_length = 0;
        int min_length = 0;
        int max_index = -1;
        int min_index = -1;
        String[] strings = new String[i];

        System.out.println(String.format("Enter %d strings", i));

        for (int j = 0; j < i; j++) {
            strings[j] = scanner.next();
            if (strings[j].length() > max_length) {
                max_length = strings[j].length();
                max_index = j;
            }
            if (j == 0 || strings[j].length() < min_length) {
                min_length = strings[j].length();
                min_index = j;
            }
        }
        System.out.println(String.format("Longest string: '%s', length: %d", strings[max_index], max_length));
        System.out.println(String.format("Shortest string: '%s', length: %d", strings[min_index], min_length));

    }

}
