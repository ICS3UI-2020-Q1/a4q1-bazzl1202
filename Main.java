import java.util.Scanner;
/**
 * Asks for a number and counts down by 5
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

   // ask the user for an intger
   System.out.println("Please enter an integer to count down to");
   int integer = input.nextInt();

   // declare and initilaze variable you count down from
   int count = 100;

   // tell user the count down is starting
   System.out.println("Count Down:");

   while(integer <= count){
     // print the number we are at 
     System.out.println(count);
     // decrease the value of the number by 5
     count = count - 5;
     
   }
    
  }
}
