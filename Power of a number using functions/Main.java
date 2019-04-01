import java.util.Scanner;
class Main{
  public static int pow(int m,int n)
  {
      int p=1;
    while(n>0)
    {
        p=p*m;
         n--;
    }
    return p;
  }
	public static void main (String[] args){
	    Scanner sl=new Scanner(System.in);
       int b=sl.nextInt();
      int e=sl.nextInt();
      int r=pow(b,e);
      System.out.println(r);
	}
}