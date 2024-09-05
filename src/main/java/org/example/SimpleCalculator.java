package org.example;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int result = 0;

        System.out.println("Please enter first number: ");
        int firstNum = myScan.nextInt();
        myScan.nextLine();

        System.out.println("Please enter simple arithmetic operators (*, :, -, +): ");
        String operator = myScan.nextLine();


        System.out.println("Please enter second number: ");
        int secondNum = myScan.nextInt();


        switch (operator) {
            case "-": result = (firstNum - secondNum); break;
            case "+": result = (firstNum + secondNum); break;
            case "*": result = (firstNum * secondNum); break;
            case "/": result = (firstNum / secondNum); break;
        };

        System.out.println("The result is: " + result);
    }
}