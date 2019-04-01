import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int p_star=1;
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
         {
            if(p_star==1)
            {
                System.out.print("*");
              p_star=0;
            }
           else
           {
              System.out.print("#");
              p_star=1;
           }
         }
        System.out.println();
      }
      
      
    }
}