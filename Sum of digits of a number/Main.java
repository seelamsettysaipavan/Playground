import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sl=new Scanner(System.in);
      int n = sl.nextInt();
      int sum = 0;
      int r;
      while(n >  0)
      {
         r = n % 10;
        sum = sum + r;
         n = n/10;
      }
      System.out.println(sum);
	}
}