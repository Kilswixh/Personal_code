// Practising with Enum.
// Written by Calvin
public class Enum {
    public static void main(String[] args) {
        int noOfNames = 2;
        for (int i = 0; i < noOfNames; i++ )
         System.out.println("My name is "+Name.values()[i]+" And i live in Ghana");
        
    }
}

enum Name {
    Calvin, Mac, Phillips;
}
