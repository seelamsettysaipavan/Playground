import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int c = n;
      while(c>=10)
      {
         c=c/10;
      }
      
      System.out.println(c+n%10);
      
	}
}