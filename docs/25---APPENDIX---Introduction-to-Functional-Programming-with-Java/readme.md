# 25 - APPENDIX - Introduction to Functional Programming with Java

## 001 Step 01 - Getting Started with Functional Programming with Java

let's create a simple program that takes a list of numbers and print the numbers to the console.

```java
package com.wchamara.learnspringframework.examples.a8;


import java.util.List;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        printNumbers(numbers);
    }

    public static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}

```

output:

```shell
1
2
3
4
5
```

## 002 Step 02 - Writing Your First Java Functional Program

```java
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

```

output:

```shell
1
2
3
4
5
```

## 003 Step 03 - Improving Java Functional Program with filter

```java
    public static void printListOfEvenNumbersFunctional(List<Integer> numbers) {
        Predicate<Integer> predicate = number -> number % 2 == 0;
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
```

```bash
2
4
```

let's improve the program to print the square of the even numbers.

```java
public static void printListOfEvenNumbersFunctional(List<Integer> numbers) {
    numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
}    
```

## 004 Step 04 - Using Lambda Expression to enhance your Functional Program

```java
package com.wchamara.learnspringframework.examples.a8;


import java.util.List;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        printNumbers(numbers);
        printListOfEvenNumbersFunctional(numbers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    public static void printListOfEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream().filter(SimpleLauncherAppLauncherApplication::isEven).forEach(System.out::println);
    }

}

```

## 005 Step 05 - Do Functional Programming Exercises with Streams, Filters and Lambdas

```java
package com.wchamara.learnspringframework.examples.a8;


import java.util.List;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        printNumbers(numbers);
        printListOfEvenNumbersFunctional(numbers);
    }
    
    public static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    public static void printListOfEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

}

```

## 006 Step 06 - Using map in Functional Programs - with Exercises

## 007 Step 07 - Understanding Optional class in Java

## 008 Step 08 - Quick Review of Functional Programming Basics
