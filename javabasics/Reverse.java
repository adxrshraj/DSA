
import java.util.*;
public class Reverse {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int temp = n;
      while(temp != 0){
        int q = temp / 10;
        int rem = temp % 10;
        temp = q;

        System.out.println(rem);
      }


  }
}
// https://youtu.be/D_yKIOnhMRc?si=OI7-ROmA3f65v91a