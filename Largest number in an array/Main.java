import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=sl.nextInt();
      }
      int max=a[0];
      for(int i=0;i<n;i++)
      {
        if(max<a[i])
        {
           max=a[i];
        }
      }
      System.out.println(max);
    }
}