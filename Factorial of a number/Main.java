import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code heree
      Scanner sl =new Scanner(System.in);
      int n=sl.nextInt();
      int fact=1;
    if(n==1&&n==0)
    {
      System.out.println(fact);
    }
      else
      {
         for(int i=2;i<=n;i++)
         {
            fact= fact*i;
         }
        System.out.println(fact);
      }
    }
}