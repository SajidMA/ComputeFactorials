// Sajid Ahmed
// Lab 7.2 - Nested while Loops
// Print out the factorial of the integer the user requests

package computefactorials;

import java.util.Scanner;
public class ComputeFactorials 
{

    public static void main(String[] args) 
    {
        int factInt; //the integer you want to use for the factorial
        int factorial; //the answer
        String endgame; //the string to ask if you want to compute another factorial

        Scanner scan = new Scanner(System.in);

        do 
        {
            //ask the user to enter a positive number
            System.out.print("Please enter a nonnegative integer: ");
            factInt = scan.nextInt();
            while (factInt < 0) //loop if the user enters a negative number
            {
                System.out.println("Factorial is undefined for negative numbers.");
                System.out.print("Please enter a non-negative integer: ");
                factInt = scan.nextInt();
            }
            System.out.print(factInt + "! = "); //prints factInt with no new line
            factorial = 1; //initializes factorial to 1

            while (factInt > 0) //loop to compute the factorial if positive number
            {
                factorial = factorial * factInt;
                factInt--;
            }

            System.out.println(factorial); //prints factorial on same line as factInt
            //asks the user if they want to compute another factorial
            System.out.println("Compute another factorial (y/n)? ");
            endgame = scan.next();
        } 
        while (endgame.equals("y")); //if endgame is "y", loop restarts
    }
}
