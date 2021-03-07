package com.personal.abhinavjdwij.tryout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    int empId;
    String firstName;
    String lastName;
}

public class StreamTryout {
    private static Set<Integer> convertListToSet(List<Integer> list) {
        return (list == null) ? null : list.stream().collect(Collectors.toSet());
    }

    public static Map<Integer, Employee> getEmpIdToEmployeeMap(List<Employee> employees) {
        return (employees == null) ? null :
                employees.stream().collect(Collectors.toMap(Employee::getEmpId, employee -> employee));
    }

    /* Exercises */

    // 1 : Convert List To Set
    public static void exercise1() {
        System.out.println("Exercise 1");
        System.out.println(convertListToSet(Arrays.asList(1, 2, 2, 3, 4, 3)));
        System.out.println();
    }

    // 2 : Map list of Employees to their empId
    public static void exercise2() {
        System.out.println("Exercise 2");
        System.out.println(getEmpIdToEmployeeMap(
           Arrays.asList(
                   new Employee(1, "Abhinav", "Jha"),
                   new Employee(2, "Jane" , "Doe"),
                   new Employee(3, "John", "Wick")
           )
        ));
        System.out.println();
    }

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
}