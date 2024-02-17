package Homework1.Problem1;

public class CommisionEmployee extends Employee{
    private String commisionRate;
    private String grossSalary;
    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, String commisionRate, String grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commisionRate = commisionRate;
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString()
    {
        return firstName + " | " + lastName + " | " + socialSecurityNumber + " | " + commisionRate + " | " + grossSalary;
    }
}
