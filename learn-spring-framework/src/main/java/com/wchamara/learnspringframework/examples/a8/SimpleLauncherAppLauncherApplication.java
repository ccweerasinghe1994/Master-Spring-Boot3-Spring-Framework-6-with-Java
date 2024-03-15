package com.wchamara.learnspringframework.examples.a8;


import java.util.List;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        printNumbers(numbers);
        printListOfNumbersFunctional(numbers);
    }

    public static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

}
