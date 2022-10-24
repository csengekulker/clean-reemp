package models;

import java.util.ArrayList;
import java.util.Arrays;

public class MainModel {

    public ArrayList<Employee> getEmployeeList() {
        /* Mocking */
        Employee[] employeeArray = {
            new Employee(1, "Pasz Tamás", "Szeged", 387),
            new Employee(2, "Remek Béla", "Szolnok", 355),
            new Employee(3, "Fél Elemér", "Szeged", 329),
            new Employee(4, "Rántó Balázs", "Szolnok", 317),
        };

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(employeeArray));
        
        return employeeList;
    }
}
