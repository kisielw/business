package pl.sdacademy.podstawy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Country poland = new Country(65, "Poland");
        Country germany = new Country(67, "Germany");
        Country japan = Country.fromName("Japan");

        for (Country country : new Country[]{poland, germany}) {
            System.out.println(country);
        }

        Company terravita = new Company(poland, "Terravita");
        Company volkswagen = new Company(germany, "Volkswagen");

        Employee employee1 = new Employee("Hans", "M\u00fcller", LocalDate.of(1945, 12, 18));
        Employee employee2 = new Employee("Helga", "Schweinsteiger", LocalDate.of(1985, 5, 13));
        Employee employee3 = new Employee("Jan", "Kowalski", LocalDate.of(1985, 1, 12));
        Employee employee4 = new Employee("Adam", "Nowak", LocalDate.of(1965, 4, 28));

        volkswagen.setEmployees(new Employee[]{employee1, employee2});
        terravita.setEmployees(new Employee[]{employee3, employee4});


        for (Company company : new Company[]{terravita, volkswagen}) {
            for (Employee employee : company.getEmployees()) {
                System.out.printf("Państwo: %s, Nazwa firmy: %s, Pracownik: %s\n",company.getCountry(), company, employee);
            }
        }

        for (Employee employee : volkswagen.getRetiredEmployees(LocalDate.of(2060,3,4))) {
            System.out.println(employee.toString());
        }

        for (Employee employee : volkswagen.getRetiredEmployees()) {
            System.out.println("NOW:" + employee.toString());
        }

        for (Company company : new Company[]{terravita, volkswagen}) {
            company.raise(new BigDecimal(900));
        }

        for (Company company : new Company[]{terravita, volkswagen}) {
            company.raise(new BigDecimal("100.5"));
        }
    }

}
