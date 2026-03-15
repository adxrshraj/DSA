import java.util.*;
public class containsDuplicate{
  public static void main(String[] args) {
    int nums[] = {1,2,3,1};
boolean found = false;
      for (int i = 0; i < nums.length; i++) {
        int j = i + 1;

        while (j != i) {
          if (nums[i] == nums[j % nums.length]){
            found = true;
            break;
          }
          j++;

        }
        if (found){
          break;

        }
        if (found){
          System.out.println("This has duplicates");
        }else {
          System.out.println("This doesnt have duplicates");
        }

      }
      if (found){
          System.out.println("This has duplicates");
        }else {
          System.out.println("This doesnt have duplicates");
        }

    }

  }