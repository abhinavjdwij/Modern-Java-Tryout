package com.personal.abhinavjdwij.tryout;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamTryout {
    public static void main(String[] args) {
        String s = "dacb";
        System.out.println(sortString.apply(s));
    }

    static Function<String, String> sortString =
            str -> {
                return (str == null
                        ? null
                        : Stream.of(str.split(""))
                        .sorted()
                        .collect(Collectors.joining("")));
            };
}
