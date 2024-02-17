package Homework1.Problem2;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt)
    {
        setName(name);
        setYearBuilt(yearBuilt);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void print()
    {
        System.out.println("\nShip Name: " + getName() + "\nYear Built: " + getYearBuilt());
    }
}
