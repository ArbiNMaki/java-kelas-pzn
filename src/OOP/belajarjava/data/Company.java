package OOP.belajarjava.data;

// Company = Outer Class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Employee = Inner Class
    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
