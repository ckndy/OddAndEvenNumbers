package numbers;

import java.util.Scanner;

public class Numbers {

  public static void main(String[] arguments) {

    int number;
    System.out.println("Please enter a number:");

    // Below shows that the input provided by the user is stored in 'number'.

    Scanner input = new Scanner(System.in);
    number = input.nextInt();

    // A number is called even if it is divisible by two.
    // A number is called odd if it is not divisible by two.

    if (number % 2 == 0) {
      System.out.println("This number is even");
    }
    
    if (number % 2 != 0) {
      System.out.println("This number is odd");
    }
  }
}
   
