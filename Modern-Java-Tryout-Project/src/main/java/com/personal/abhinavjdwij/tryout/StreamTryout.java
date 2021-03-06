package com.personal.abhinavjdwij.tryout;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTryout {
    private static Set<Integer> convertListToSet(List<Integer> list) {
        return (list == null) ? null : list.stream().collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(convertListToSet(Arrays.asList(1, 2, 2, 3, 4, 3)));
    }
}
