package com.idodevjobs;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(101, "mark", 23), new Employee(102, "ron", 20), new Employee(103, "jon", 28));
        empList.sort(Employee::compareByAge);
        System.out.println(empList);
    }
}

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static int compareByAge(Employee emp1, Employee emp2) {
        return emp1.getAge() - emp2.getAge();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
