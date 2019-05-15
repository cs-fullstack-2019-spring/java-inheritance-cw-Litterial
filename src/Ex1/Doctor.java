package Ex1;

public class Doctor extends Person //inherits person
{
    public Doctor(String name) //ask for a string parameter to give the doctor a name *setName() is inside the person
    {
        setName(name);
    }
    public String toString() //returns object as a string
    {
        String message = "Good morning/Afternoon Dr." +getName(); //calls getName function inside parent
        return message;
    }
}
