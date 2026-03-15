import java.util.*;

public class Prime{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the total number:");
    int t = scn.nextInt();

  for(int i = 0; i < t; i++){

    System.out.println("Enter the number:");
    int n = scn.nextInt();
    boolean prime = true;

    if(n == 2){
      prime = true;
    }else{

      for (int j = 2; j < n; j++){
        if(n%j == 0){
          prime = false;
        }
    }
    }
    if(prime){
      System.out.println(n + " is Prime");
    }else{
      System.err.println(n + " is not Prime");
    }

    }
    }

  }

