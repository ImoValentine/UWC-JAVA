import java.util.Scanner;
public class FactorialDemo2{
   
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       //Recursion: Function calling itself!!
       else
       output = fact(n-1)* n;
       return output;
   }

public static void main(String args[]){
    Scanner kb= new Scanner(System.in);
    System.out.println("Ënter the numbeto the calculate the factorial of: ")
    
      int factorial = fact(b);
      System.out.println("Factorial of 4 is: "+factorial);
}
}