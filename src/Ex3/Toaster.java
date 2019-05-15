package Ex3;

import java.util.ArrayList;

public class Toaster extends Appliance
{
    private ArrayList<String> toaster=new ArrayList<String>();



    public Toaster(String Name)
    {
        setName(Name);
    } //calls function from this child a name.

    public void turnOn()
    {
        System.out.println("Leggo my Eggo.");

    }

    public ArrayList<String> insertItem(String name) //add to array
    {
        System.out.println("Insert "+name);
        toaster.add(name);
        return toaster;

    }
    public ArrayList<String> removeItem(String name) //delete from array
    {
        toaster.remove(name);
        return toaster;
    }
    public ArrayList<String> seeItems()
    {
        return toaster;
    } //return array
}
