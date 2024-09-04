package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        //task10
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some number separated by space: ");
        String[] strNum = input.nextLine().split(" ");
        int[] theNumbers = new int[strNum.length];
        for (int i =0; i <= strNum.length-1; i++ ){
            theNumbers[i] = Integer.parseInt(strNum[i]);
        }
        System.out.println();
        for(int num: theNumbers){
            System.out.println(num);
        }
        int minValue = Arrays.stream(theNumbers).min().getAsInt();
        System.out.println("Max number from the list of arrays is: " + minValue);
    }
}
