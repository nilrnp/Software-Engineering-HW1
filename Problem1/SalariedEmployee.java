package Homework1.Problem1;

public class SalariedEmployee extends Employee{
    private String weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, String weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString()
    {
        return firstName + " | " + lastName + " | " + socialSecurityNumber + " | " + weeklySalary;
    }
}
