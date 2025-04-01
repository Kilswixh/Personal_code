//  Written By Dr Govindha Ramaiah Yeluripati
// Editied by Calvin Mac Phillips

import java.util.Scanner;
import java.util.ArrayList;


public class EmployeeWorkHours{
    public static void main(String[] args){
        System.out.println("Enter the number of employees greater than 8");
        Scanner scanner = new Scanner(System.in);


    }
}

//class employee which takes name and number of hours worked.
class Employee{
    private ArrayList<String> names;
    private ArrayList<Integer> duration;

    public Employee(){
        names = new ArrayList<>();
        duration = new ArrayList<>();
    }

    // method to add name
    public void addName(String my_name) {
        names.add(my_name);
    }

    // method to add duration
    public void addDuration(int my_duration){
        duration.add(my_duration);
    }

    // Method to calculate total duration
    public int totalduration(){
        int totalcount = 0;

        for (int hours : duration) {
            totalcount += hours;
        }
        return totalcount;
    }
}