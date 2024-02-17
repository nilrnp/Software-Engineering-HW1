package Homework1.Problem2;

public class CruiseShip extends Ship{
    private int maxCapacity;
    public CruiseShip(String name, String yearBuilt, int maxCapacity) {
        super(name, yearBuilt);
        setMaxCapacity(maxCapacity);
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void print() {
        System.out.println("\nShip Name: " + getName() + "\nMaximum Number of Passengers: " + getMaxCapacity());
    }
}
