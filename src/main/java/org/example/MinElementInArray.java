package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MinElementInArray {
    public static void main(String[] args) {
        //task10
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some number separated by space: ");
        String[] strNum = input.nextLine().split(" ");
        Integer[] theNumbers = new Integer[strNum.length];
        for (int i =0; i <= strNum.length-1; i++ ){
            theNumbers[i] = Integer.parseInt(strNum[i]);
        }
        List<Integer> numList = Arrays.asList(theNumbers);

        Optional<Integer> minValue =
                numList.stream()
                        .reduce((n1, n2) -> n1 < n2? n1:n2);
        minValue.ifPresent(e -> System.out.println("The smallest number is: " + e));

        numList.sort(Comparator.naturalOrder());
        System.out.println("the second smallest number is: " + numList.get(1));

        }
    }




