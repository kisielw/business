package pl.sdacademy.podstawy;

public class Company {

    private final Country country;
    private final String companyName;
    private Employee[] employees;

    public Company(Country country, String companyName) {
        this.country = country;
        this.companyName = companyName;
        this.employees = new Employee[0];
    }

    public Country getCountry() {
        return country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String toString() {
        return companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        if (employees != null) {
            this.employees = employees;
        }
    }
}
