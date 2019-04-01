import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sl=new Scanner(System.in);
    int n=sl.nextInt();
    int fd=n/100;
    int sd=(n/10)%10;
    int ld=n%10;
    int rn=ld*100+sd*10+fd;
    System.out.println(rn);
  }
}