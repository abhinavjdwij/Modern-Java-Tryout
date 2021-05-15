package com.personal.abhinavjdwij.tryout;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.personal.abhinavjdwij.tryout.StreamTryout2.Gender.FEMALE;
import static com.personal.abhinavjdwij.tryout.StreamTryout2.Gender.MALE;

public class StreamTryout2 {
    public static void main(String[] args) {

        // test getIndicesWithFemales
        List<Person> persons = List.of(
                new Person("Abhinav", MALE),
                new Person("Jane", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Bob", MALE),
                new Person("Lynda", FEMALE),
                new Person("Joe", MALE)
        );
        System.out.println(getIndicesWithFemales(persons));

    }

    // get index of elements which are
    private static List<Integer> getIndicesWithFemales(List<Person> persons) {
        return IntStream.range(0, persons.size() - 1)
                .filter(index -> FEMALE == persons.get(index).gender)
                .boxed().collect(Collectors.toList());
    }

    static class Person {
        public String name;
        public Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    static enum Gender {
        MALE, FEMALE
    }
}
