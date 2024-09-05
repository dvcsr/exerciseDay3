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
        System.out.println(minValue.get());
        int num = minValue.get();


        numList.sort(Comparator.naturalOrder());
        System.out.println("the second smallest number is: " + numList.get(1));






        //minValue.ifPresent(integer -> numList.remove(integer));

        //rnumList.remove(Integer.valueOf(remove));

       // Optional<Integer> secondMinValue =
              //  numList.stream()
                   //     .reduce((n1, n2) -> n1 < n2? n1:n2);

        //System.out.println(secondMinValue.get());
        //secondMinValue.ifPresent(integer -> System.out.println("second min value is: " + integer));
        //System.out.println("The least numbers is " + minValue.get());
        }
    //public static int findSecondSmallest(List<Integer> list, int n1){
     //   int result = 0;
       // result = list.stream().sorted().reduce()
       // return result;

    }




