import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sl=new Scanner(System.in);
    int n=sl.nextInt();
    int m=3;
    for(int i=1;i<=n;i++)
    {
       System.out.print(i);
      if((i%m==0)&&(i!=n))
      {
         System.out.print(",");
      }
    }
  }
}