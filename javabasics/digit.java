
import java.util.Scanner;

public class digit {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      System.out.println("Enter your Number: ");
      int n = scn.nextInt();

      String s = String.valueOf(n);
      System.out.println("The no of Digits is " + s.length());
  }
}
