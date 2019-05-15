package Ex3;

import java.util.ArrayList;

public class Refrigerator extends Appliance
{
    private ArrayList<String> refrigerator=new ArrayList<String>();

    public Refrigerator(String Name) //calls function from this child a name.
    {
        setName(Name);
    }

    public void turnOn()
    {
        System.out.println("Is your refrigerator running? If so, you better go catch it.");

    }

    public ArrayList<String> insertItem(String name)  //add to array
    {
        System.out.println("Insert "+name);
        refrigerator.add(name);
        return refrigerator;

    }
    public ArrayList<String> removeItem(String name)//delete from array
    {
        refrigerator.remove(name);
        return refrigerator;
    }
    public ArrayList<String> seeItems()  //return array
    {
        return refrigerator;
    }
}
