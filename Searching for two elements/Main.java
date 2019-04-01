import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
       int is=0;
      int a[]=new int [n];
      for(int i=0;i<n;i++)
      {
        a[i]=sl.nextInt();
      }
      int se1=sl.nextInt();
      int se2=sl.nextInt();
     for(int i=0;i<n;i++)
     {
        if(se1==a[i])
        {
           is=1;
          System.out.println(i);
          break;
        }
     }
      if(is==0)
      { 
        System.out.println("-1");
      }
      for(int i=0;i<n;i++)
     {
        if(se2==a[i])
        {
           is=2;
          System.out.println(i);
          break;
        }
     }
       if(is!=2)
      { 
        System.out.println("-1");
      }
      
      
    }
}