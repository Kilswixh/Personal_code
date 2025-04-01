import java.util.Scanner;

public class Emp {
    public static void main(String[] args){
        Employee[] emp = new Employee[2]; // create an array of type Employee to contain employee objects
        Scanner ip = new Scanner(System.in); // instantiate the scanner to prompt and take user input from the keyboard
        System.out.println("Enter the names of the employees you want to add");
        for (int i = 0; i < 2; i++){ // ask the user twice
            emp[i] = new Employee(); // for each array created, it would be occupied by an object
            System.out.println("Enter name: ");
            emp[i].name = ip.next();
            System.out.println();

            System.out.println("Enter the daily working hours for "+emp[i].name+": ");
            for (int j = 0;j <5; j++){
                System.out.println(Day.values()[j] + ":");// use of the enum
                emp[i].day_hours[j] = ip.nextInt();
            }

            emp[i].totalWeekHours();
        }
        for (int i = 0 ; i < emp.length-1; i++){
            int max = i;
            for (int j = i + 1; j < emp.length; j++){
                if (emp[j].week_hours > emp[max].week_hours){
                    max = j;
            }
        }

        if (max != i){
            Employee temp = emp[max];
            emp[max] = emp[i];
            emp[i] = temp;   
        }
    }
        System.out.println("Th output");
            for(int i = 0; i < emp.length; i++)
            System.out.println(emp[i].name + "worked for:"+ emp[i].week_hours+ "hours");

    ip.close();


    }
}
// template for an employee; He is going to have a name, total hours in a week and also store the daily hours
class Employee {
    String name; // employee's name
    int[] day_hours = new int[5]; // an array containing the hours for each day
    int week_hours; // sum of the hours in each day
    void totalWeekHours(){ //because we will be calculating the total number of hours in a week for each employee; add it has a method.
        week_hours = 0; // initialize
        for(int i = 0; i < 5; i++)
            week_hours += day_hours[i]; //continous addition

    }
}

    enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
    }