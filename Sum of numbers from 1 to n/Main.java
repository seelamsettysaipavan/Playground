import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sl=new Scanner(System.in);
      int s=0;
      int n=sl.nextInt();
      for(int i=1;i<=n;i++)
      {
         s=s+i;
      }
      System.out.println(s);
	}
}