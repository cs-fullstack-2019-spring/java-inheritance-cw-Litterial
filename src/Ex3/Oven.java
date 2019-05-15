package Ex3;
import java.util.ArrayList;

public class Oven extends Appliance
{
    private ArrayList<String> oven=new ArrayList<String>();

    public Oven(String Name)
    {
        setName(Name);
    } //calls function from this child a name.

    public void turnOn()
    {
        System.out.println("The oven is on.");

    }

    public ArrayList<String> insertItem(String name) //add to array
    {
        System.out.println("Insert "+name);
        oven.add(name);
        return oven;

    }
    public ArrayList<String> removeItem(String name) //delete from array
    {
        oven.remove(name);
        return oven;
    }
    public ArrayList<String> seeItems()
    {
        return oven;
    } //return array
}
