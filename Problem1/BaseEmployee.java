package Homework1.Problem1;

public class BaseEmployee extends Employee{
    private String baseSalary;
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, String baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString()
    {
        return firstName + " | " + lastName + " | " + socialSecurityNumber + " | " + baseSalary;
    }

}
