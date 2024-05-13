package OOP.belajarjava.app;

import OOP.belajarjava.data.Company;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Chelsea Football Club");

        Company.Employee employee = company.new Employee();
        employee.setName("Arbi Dwi Wijaya");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company2 = new Company();
        company2.setName("Rakuten");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Kalista");

        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
