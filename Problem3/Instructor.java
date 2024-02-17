package Homework1.Problem3;

public class Instructor {
    private String firstName;
    private String lastName;
    private int officeNumber;

    public Instructor(String firstName,String lastName,int officeNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setOfficeNumber(officeNumber);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

