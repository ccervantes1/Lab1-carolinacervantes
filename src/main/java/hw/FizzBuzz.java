package hw;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public static void fizzBuzz(int n) {
    for (int i = 1; i<=n; i++){
      if (i % 15 == 0){
        System.out.println("FizzBuzz" + " "); }

      else if (i % 3 == 0){
        System.out.println("Fizz" + " "); }

      else if (i % 5 == 0){
        System.out.println("Buzz"+ " "); }


      else{
        System.out.println(i + " "); }

    }
  }

  public static String[] fizzBuzzArray(final int n) {

    String[] Final = new String[n+1];

    if (n>=0) {
      for (int i =1; i < n+1; i++) {

        if ( i % 3 == 0 && i % 5 == 0) { Final[i] = "FizzBuzz"; }
        else if (i % 3 == 0) { Final[i] = "Fizz"; }
        else if (i % 5 == 0) { Final[i] = "Buzz"; }
        else { Final[i] = String.valueOf(i);

      }
    }

    }
    return Final;
  }

}
