package Homework1.Problem2;

public class ShipRunner {

    public static void main(String[] args) {
        Ship shipsArray[] = new Ship[3];

        shipsArray[0] = new Ship("Titanic","1909");
        shipsArray[1] = new CruiseShip("Icon of the Seas","2022",7600);
        shipsArray[2] = new CargoShip("Madrid Maersk","2017",20568);

        for(int i = 0; i < shipsArray.length; i++)
        {
            shipsArray[i].print();
        }
    }
}
