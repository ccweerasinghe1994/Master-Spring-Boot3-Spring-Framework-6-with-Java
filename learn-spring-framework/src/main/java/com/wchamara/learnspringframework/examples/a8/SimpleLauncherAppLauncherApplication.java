package com.wchamara.learnspringframework.examples.a8;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SimpleLauncherAppLauncherApplication {

    public static void main(String[] args) {
//        Optional
        List<String> arguments = Arrays.asList(args);

        Optional<String> first = Arrays.stream(args)
                .filter(s -> s.startsWith("b")).findFirst();

        if (first.isPresent()) {
            System.out.println("First argument starting with b: " + first.get());
        } else {
            System.out.println("No argument starting with b");
        }
        Optional<String> value = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
    }
}
