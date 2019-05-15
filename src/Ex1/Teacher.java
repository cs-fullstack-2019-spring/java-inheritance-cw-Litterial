package Ex1;

public class Teacher extends Person //inherits person
{
    public Teacher(String name)//ask for a string parameter to give the teacher a name *setName() is inside the person
    {
        setName(name);
    }
    public String toString()//returns object as a string
    {
        String message="Hello Mr/Mrs."+getName(); //calls getName function inside parent
        return message;
    }
}
