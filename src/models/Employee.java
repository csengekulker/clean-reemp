package models;

public class Employee {
    public Integer id;
    public String name;
    public String city;
    public Double salary;
    public Employee(int id, String name, String city, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    
}
