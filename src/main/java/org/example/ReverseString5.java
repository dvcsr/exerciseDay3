package org.example;
import java.util.Scanner;

public class ReverseString5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = input.nextLine();
        String reversed = "";
        char temp;

        for (int i =0; i < str.length(); i++){
            int c = str.length()-1-i;
            temp = str.charAt(c);
            reversed = reversed + temp;
        }

        System.out.println(reversed);
    }
}
