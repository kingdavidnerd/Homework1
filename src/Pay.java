import java.util.Scanner;  // Needed for the Scanner class

/**
   This program calculates the user's gross pay.
*/

public class Pay
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Identifier declarations
      double hours;  // Number of hours worked
      double rate;   // Hourly pay rate
      double pay;    // Gross pay

      // Display prompts and get input.
      System.out.print("How many hours did you work? ");
      hours = keyboard.nextDouble();
      System.out.print("How much are you paid per hour? ");
      rate = keyboard.nextDouble();

      // Perform the calculations.
      if(hours <= 40) // if the 'hours' are less or equal to 40
         pay = hours * rate; // the pay = the hours and rate multiplied
      else // if the hours aren't less or equal to 40 then
         pay = (hours - 40) * (1.5 * rate) + 40 * rate; // the pay is = to the hours - 40 * 1.5 multiplied by the rate + 40 * the rate

      // Display results.
      System.out.println("You earned $" + pay);
   }
}