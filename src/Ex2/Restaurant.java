package Ex2;

public class Restaurant extends Building
{
    private int howManyFloors=1;
    private String hasParkingLot="Yes";
    private String hasInspection="Yes";
    private int taxRate=10;


    public Restaurant(String name) //ask for a string parameter to give the restaurant a name *setName() is inside the parent
    {
        setName(name);
    }

    public int getHowManyFloors() //getter for floors
    {
        return howManyFloors;
    }

    public String getHasParkingLot() //getter for parkinglot
    {
        return hasParkingLot;
    }

    public String getHasInspection() //getter for inspection
    {
        return hasInspection;
    }

    public int getTaxRate() //getter for tax rate
    {
        return taxRate;
    }

    public String toString() //returns a object string
    {
        String message= "Building name: "+getName()+"\nFloors: "+getHowManyFloors()+"\nParking Lot: "+getHasParkingLot()+"\nInspection: "+getHasInspection()+"\nTax Rate: "+getTaxRate()+"%";
        return message;
    }
}
