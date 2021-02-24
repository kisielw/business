package pl.sdacademy.podstawy;

import java.time.LocalDate;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private double salary;


    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return firstName +" "+ lastName;
    }
}
