import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int s=0;
      int c=n;
      for(int i=1;c>0;i++)
      {
         int r=c%10;
         s=s+r*r*r;
          c=c/10;
      }
     if(s==n)
     {
       System.out.println("Armstrong Number");
     }
      else
      {
      System.out.println("Not a Armstrong Number");
      }
      }
}