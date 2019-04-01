import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner s = new Scanner(System.in);  
       
      
       int end = s.nextInt();  
       ; 
       for (int i = 2; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   
	}
}