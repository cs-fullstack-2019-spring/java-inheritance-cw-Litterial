import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Ex1.*;
import Ex2.*;
import Ex3.*;
public class Main {

    public static void main(String[] args)
    {
//    ex1();
//    ex2();
    ex3();

    }
    public static void ex1()
    {

        Friend friend1 = new Friend("Jonathan Joestar");  //friend class
        Teacher teacher1 = new Teacher("Joseph Joestar"); //teacher class
        Doctor doctor1 = new Doctor("Jotaro Kujo"); // doctor class
        Person[] person = {friend1, teacher1, doctor1}; // puts them into an array
        ArrayList<Person> people_list = new ArrayList(Arrays.asList(person)); //puts them into an array list

        for (Person occupation : people_list) {
            System.out.println(occupation); //prints each element in the arraylist
        }
    }

    public static void ex2()
    {
        Restaurant restaurant1 = new Restaurant("Chik-a-Fil");  //restaurant class
        Resident resident1 = new Resident("Highland Row Apartments"); //resident class
        Commercial commercial1 = new Commercial("Concourse Parcels"); // commercial class
        Building[] buildings = {restaurant1, resident1, commercial1}; // puts them into an array
        ArrayList<Building> building_list = new ArrayList(Arrays.asList(buildings)); //puts them into an array list


        System.out.println("This agent has " +building_list.size()+ " buildings.\n"); // prints message about how many buildings there are
        for(Building build:building_list)
        {
            System.out.println(build);
            System.out.println("\n");
        }
    }

    public static void ex3()
    {
        Oven oven1 = new Oven("Kenmore");  //oven class
        Toaster toaster1 = new Toaster("Keurig"); //toaster class
        Refrigerator refrigerator1 = new Refrigerator("Breville"); // refrigerator class


        oven1.turnOn();
        System.out.println(oven1.insertItem("Turkey"));
        System.out.println(oven1.insertItem("Porkchops"));
        System.out.println(oven1.seeItems());
        System.out.println(oven1.removeItem("Turkey"));

        toaster1.turnOn();
        System.out.println(toaster1.insertItem("Pop Tart"));
        System.out.println(toaster1.insertItem("Eggo Waffles"));
        System.out.println(toaster1.seeItems());
        System.out.println(toaster1.removeItem("Eggo Waffles"));

        refrigerator1.turnOn();
        System.out.println(refrigerator1.insertItem("Milk"));
        System.out.println(refrigerator1.insertItem("Eggs"));
        System.out.println(refrigerator1.seeItems());
        System.out.println(refrigerator1.removeItem("Milk"));





    }




}
