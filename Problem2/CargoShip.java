package Homework1.Problem2;

public class CargoShip extends Ship{

    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        setCargoCapacity(cargoCapacity);
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("\nShip Name: " + getName() + "\nCargo Capacity: " + getCargoCapacity());
    }
}
