import java.util.*;
public class Prime2{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Total number:");
    int t = scn.nextInt();

    int count = 0;

    for(int i = 0; i < t; i++){
      System.out.println("Enter n:");
      int n = scn.nextInt();
      for(int j = 2; j*j <= n; j++){//adding j*j means we only check upto sqrt of n
        if(n%j == 0){
          count++;
          break;
          //breaks the loop saves time
        }

      }
 if (count == 0){
      System.out.println("Is Prime");
    }else{
      System.out.println("Is not Prime");
    }

    }



  }

}