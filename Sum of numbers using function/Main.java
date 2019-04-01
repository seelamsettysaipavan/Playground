import java.util.Scanner;
class Main{
  public static int sonn(int m)
  {
     int s=(m*(m+1))/2;
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
     Scanner sl=new Scanner(System.in);
      int n=sl.nextInt();
      int sol=sonn(n);
      System.out.println(sol);
	}
}