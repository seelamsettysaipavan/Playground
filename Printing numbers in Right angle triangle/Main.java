import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      for(int i=1;i<=n;i++)
      { 
         for(int j=1;j<=i;j++)
         {
            System.out.print(i);
         }
        System.out.println();
      }
	}
}