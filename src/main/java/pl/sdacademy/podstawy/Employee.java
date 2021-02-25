package pl.sdacademy.podstawy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private BigDecimal salary;


    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = BigDecimal.ZERO;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return firstName +" "+ lastName;
    }

    public boolean isRetired(LocalDate referenceDate, Country country) {
        Period agePeriod = Period.between(birthDate, referenceDate);
        int age = agePeriod.getYears();
        int retireAge = country.getRetirementAge();

        return  age >= retireAge;
    }

    public BigDecimal raise(BigDecimal raiseValue){
        salary = salary.add(raiseValue);
        return salary;
    }
}
