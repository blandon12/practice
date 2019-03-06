package com.coding.practice.recursion.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
    public String name;
    public List<Employee> employeeList;

    public Employee(String name, List<Employee> employeeList) {
        this.name = name;
        this.employeeList = employeeList;
    }
}

public class Solution {

    public static Employee alphabetFirst(Employee employee) {

        if (employee.employeeList.isEmpty()) {
            return employee;
        }

        Iterator<Employee> employeeIterator = employee.employeeList.iterator();
        Employee temp = employee;
        while (employeeIterator.hasNext()) {
            Employee e = alphabetFirst(employeeIterator.next());
            if (temp.name.compareTo(e.name) > 0) {
                temp = e;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        List<Employee> abbyList = new ArrayList<>();
        Employee abby = new Employee("abby", abbyList);
        List<Employee> aaronList = new ArrayList<>();
        Employee aaron = new Employee("aaron", aaronList);

        List<Employee> kevinList = new ArrayList<>();
        kevinList.add(abby);
        kevinList.add(aaron);
        Employee kevin = new Employee("kevin", kevinList);

        List<Employee> aaaxList = new ArrayList<>();
        Employee aaax = new Employee("aaax", aaaxList);

        List<Employee> jackList = new ArrayList<>();
        jackList.add(aaax);
        Employee jack = new Employee("jack", jackList);

        List<Employee> bobList = new ArrayList<>();
        bobList.add(kevin);
        bobList.add(jack);
        Employee bob = new Employee("bob", bobList);

        Employee result = alphabetFirst(bob);
        System.out.println(result.name);
    }
}