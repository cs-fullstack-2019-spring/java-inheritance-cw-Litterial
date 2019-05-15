package Ex2;

public class Building
{
private String name;
private int squareFeetPerFloor;

    public String getName() //gets the name of the building
    {
        return name;
    }

    public void setName(String name) //sets the name of the building
    {
        this.name = name;
    }

    public int getSquareFeetPerFloor() {
        return squareFeetPerFloor;
    }

    public void setSquareFeetPerFloor(int squareFeetPerFloor) {
        this.squareFeetPerFloor = squareFeetPerFloor;
    }
}
