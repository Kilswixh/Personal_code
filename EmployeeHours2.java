//  Written By Dr Govindha Ramaiah Yeluripati
// Editied by Calvin Mac Phillips

// Program to compute total number of hours spent working with the corresponding employee name.

 import java.util.Arrays; // importing java. Array because I will be using arrays to store the names and numbers
 import java.util.Comparator; // sorting and returning an interger based on which number is greater.
 import java.util.Scanner; // to take input from the user.

 public class EmployeeHours2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int numEmployees = 8; // number of employees fixed number
        int numDays = 5; // Monday - Friday
        String[] employeeNames = new String[numEmployees]; // creating an array to store employee names
        int[][] workHours = new int[numEmployees][numDays + 1]; // Last column for total hours

        System.out.println("Please enter the name of each employee and their daily workhours (Mon-Fri).");

// Input employee names and work hours
 for (int i = 0; i < numEmployees; i++) {
    System.out.print("Enter the employee name: ");
    employeeNames[i] = ip.next(); //Ask user for employee name.
    System.out.println("Enter the daily working hours for " + employeeNames[i] +": "); //Enter daily working Hours the Specific day will show.

    int total = 0; //Total number of hours spent in a week.
    for (int j = 0; j < numDays; j++) {
    System.out.print(Day.values()[j] + ": "); // using enum you must use .values() [i]
    workHours[i][j] = ip.nextInt(); // the j increases as the days change.
    total += workHours[i][j]; // cumulative addition
    }
    workHours[i][numDays] = total; // Store total hours in the last column
 }

 // Sorting based on total work hours in descending order
    Integer[] indices = new Integer[numEmployees]; //comparator cannot work directly with primitive types.
    for (int i = 0; i < numEmployees; i++) {
        indices[i] = i; // Store indices for sorting
    }

 Arrays.sort(indices, Comparator.comparingInt(i -> -workHours[i][numDays])); //Descending order

 // Display sorted output
    System.out.println("\nSorted List Based on Total Working Hours:");
    for (int i = 0; i < numEmployees; i++) 
    {
        int index = indices[i];
        System.out.println(employeeNames[index] + " worked for: " + workHours[index][numDays] + " hours.");
        }

     ip.close();
    }
}
 // Enum for Days of the Week
 enum Day {
 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}

