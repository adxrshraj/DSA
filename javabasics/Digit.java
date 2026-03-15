public class Digit {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int count = 0;

      int temp = n;

      while (temp != 0){
        temp = temp / 10;
        count++;
      }

      int div = (int)Math.pow(10, count - 1);



      while(div != 0){//div decide krta he ki kab tk kna he ye kaam kyuki agar n se karoge toh fir last me jab 0 bachega toh dikkat ho jayega
        int q = n / div;
        System.out.println(q);
        n = n % div;
        div = div / 10;
      }

      //look at this lec for further clarification: https://youtu.be/gZp776a-pbQ?si=Hn5TR1rF8thrBxBF


  }
}
