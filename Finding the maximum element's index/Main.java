import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sl=new Scanner(System.in);
    int n=sl.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i]=sl.nextInt();
    }
    maxindex(a,n);
  }
 public static  int maxindex(int a[],int n)
 {
      int max=a[0];
   for(int i=0;i<n;i++)
   {
      if(a[i]>max)
      {
         max=a[i];
      }
   }
   for(int i=0;i<n;i++)
   {
     if(max==a[i])
     {
        System.out.println(i);
      }
   }
    return 1;
  }
}
