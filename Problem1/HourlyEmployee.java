package Homework1.Problem1;

public class HourlyEmployee extends Employee{
    private String wage;
    private int hoursWorked;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, String wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }

    @Override
    public String toString()
    {
        return firstName + " | " + lastName + " | " + socialSecurityNumber + " | " + wage + " | " + hoursWorked;
    }
}
