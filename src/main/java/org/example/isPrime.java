package org.example;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        //task2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        Long theNumber = input.nextLong();

        String result = (isPrime(theNumber))? "it is a prime number" : "it's not a prime number";
        System.out.println(result);

    }
    public static boolean isPrime(Long number) {
        for(int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;//number is prime
    }
}
