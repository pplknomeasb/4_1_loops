package org.perscholas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //trigger created to end loops
        boolean repeat = true;

        //variables to hold int numbers.  one for input by the user, two to sum the total with.
        int numberEntry;
        int total=0;

        //Creating a string for the final output

        String allNumbers="";

        //creating a loop to generate the numbers the user wants to input to be summed together
        do {

            System.out.printf("Enter a number: (To end the program, type the number 0} \n");

            //Scanner for user input
            Scanner input = new Scanner(System.in);

            //adding value
            numberEntry = input.nextInt();

            //The program exits when the user input the number 0
            if(numberEntry != 0){
                total=total+numberEntry;

                //Building the final result print screen
                allNumbers = allNumbers + String.format(numberEntry+", ");

            }else{

                //Once the user enters 0, the value of repeat is changed to false
                repeat=false;
            }

        }

        //Once the result repeat is recognized as false, it exits the loop
        while(repeat);

        //Final statement before the program ends
        System.out.println("The sum of "+allNumbers+" is " + total + ".  Good Bye!");
    }


}
