package Ex2;

public class Commercial extends Building
{
    private int howManyFloors=4;
    private String hasParkingLot="Yes";
    private String hasInspection="Yes";
    private int taxRate=15;

    public Commercial(String name) //ask for a string parameter to give the commercial a name *setName() is inside the parent
    {
        setName(name);
    }

    public int getHowManyFloors() { //getter for floors
        return howManyFloors;
    }

    public String getHasParkingLot() { //getter for parkinglot
        return hasParkingLot;
    }

    public String getHasInspection() { //getter for inspection
        return hasInspection;
    }

    public int getTaxRate() { //getter for tax rate
        return taxRate;
    }

    public String toString() //returns a object string
    {
        String message= "Building name: "+getName()+"\nFloors: "+getHowManyFloors()+"\nParking Lot: "+getHasParkingLot()+"\nInspection: "+getHasInspection()+"\nTax Rate: "+getTaxRate()+"%";
        return message;
    }
}
