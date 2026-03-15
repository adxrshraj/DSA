/*import java.util.*;
public class Inverse {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int nod = 0;

       int temp = n;

      while (temp != 0){
        temp = temp / 10;
        nod++;
      }

      //this finds no of digits

      int p = 1;
      int p1;
      int d;
      int inverse = 0;
      int temp3 = n;

      while(p <= nod){
        d = temp3 % 10;
        temp3 = temp3 / 10;

        int x = (int)Math.pow(10, d - 1);
        p1 = p * x;

        inverse = inverse + p1;
        p++;

      }
      //this finds our inverse of the number
      System.out.println("Inverse of " + n + " is " + inverse);

      int div = (int)Math.pow(10, nod - 1);
      int temp2 = inverse;

      while(div != 0){
        int q = temp2 / div;
        System.out.println(q);

        temp2 = temp2 % div;
        div = div / 10;
      }
      //this prints the digits of the inverse number
  }
}
*/

import java.util.*;

public class Inverse {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int position = 1;
    int inverse = 0;

    while(n != 0){

      int digit = n % 10;
      n = n / 10;

      inverse = inverse + position * (int)Math.pow(10, digit - 1);

      position++;
    }

    System.out.println(inverse);
  }
}
