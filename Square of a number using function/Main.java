import java.util.Scanner;
class Main
{
   public static int sq(int m)
   {
      int sqr=m*m;
     return sqr;
   }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int sol=sq(n);
      System.out.println(sol);
	} 
}