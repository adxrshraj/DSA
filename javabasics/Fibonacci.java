import java.util.*;
public class Fibonacci{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      System.out.print("Enter N: ");
      int n = scn.nextInt();
       System.out.println("Fibonacci Sequence:");
        System.out.println(0);
        if(n > 1){System.err.println(1);

        int m = n - 2;
      for(int i = 0; i < m; i++){
        int j = i + 1;
        System.out.println(i + j);
      }

      }

  }

}
