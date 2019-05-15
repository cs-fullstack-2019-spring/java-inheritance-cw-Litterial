package Ex1;

public class Friend extends Person //inherits person
{

    public Friend(String name) //ask for a string parameter to give the friend a name *setName() is inside the person
    {
        setName(name);
    }

    public String toString() //returns object as a string
    {
        String message="What's up "+getName(); //calls getName function inside parent
        return message;
    }

}
