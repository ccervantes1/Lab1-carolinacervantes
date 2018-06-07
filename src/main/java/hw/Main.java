package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    System.out.println("Enter a positive integer: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(String.valueOf(input));
      } catch (NumberFormatException e) {
        System.err.println("The argument entered must be an integer. Please, try again! ");
//In our case, you can use System.out.println.
        System.exit(1);
      }
      /* Since you are trapping the error, you can exit with a 0 instead of
       * 1. By convention, a 0 means a normal exit (no error), and a non-
       * zero value means some type of error. But it still ends the program
       * and returns to the OS. So it’s more of a status message to you.
       */
    }

    if (Integer.parseInt(String.valueOf(input)) < 0) {
      System.out.println("Only positive integers, please. Try again!");
    }

    FizzBuzz.fizzBuzz(max);

    String[] fizzBuzzFinal;

    fizzBuzzFinal = FizzBuzz.fizzBuzzArray(input);

    System.out.println(Arrays.toString(fizzBuzzFinal));

  }

    }