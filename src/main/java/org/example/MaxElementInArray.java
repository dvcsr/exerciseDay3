package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaxElementInArray {
    public static void main(String[] args){
            //task3
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
             int maxValue = Arrays.stream(theNumbers).max().getAsInt();
        System.out.println("Max number from the list of arrays is: " + maxValue);




    }
}
