package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //task1
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        Long theNumber = input.nextLong();
        System.out.println("The sum of digits in a given number is: " + getSum(theNumber));
    }
    public static Long getSum(Long n){
        Long sum = 0L;
        while(n != 0){
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum;
    }
}
