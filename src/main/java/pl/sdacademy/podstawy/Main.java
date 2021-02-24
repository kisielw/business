package pl.sdacademy.podstawy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country(65, "Poland");
        Country germany = new Country(67, "Germany");

        for (Country country : new Country[]{poland, germany}) {
            System.out.println(country);
        }

        Company terravita = new Company(poland, "Terravita");
        Company volkswagen = new Company(germany, "Volkswagen");

        Employee employee1 = new Employee("Hans", "M\u00fcller", LocalDate.of(1970,12,18));
        Employee employee2 = new Employee("Helga", "Schweinsteiger", LocalDate.of(1985,5,13));

        volkswagen.setEmployees(new Employee[]{employee1, employee2});

        terravita.setEmployees(null);


        for (Company company : new Company[] {terravita, volkswagen}) {
            for (Employee employee : company.getEmployees()) {
                System.out.printf("Nazwa firmy: %s, Pracownik: %s\n", company, employee);
            }
        }
    }
}
