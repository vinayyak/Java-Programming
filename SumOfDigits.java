import java.util.Scanner;  

public class SumOfDigits  
{  
  public static void main(String args[])  
    {  
      int n, d, sum = 0;  
      Scanner in = new Scanner(System.in);  
      System.out.println("Enter the number: ");  
      n = in.nextInt();  
    while(n > 0)  
        {   
            //finds the last digit of the given number    
            d = n % 10;  
            //adds last digit to the variable sum  
            sum = sum + d;  
            //removes the last digit from the number  
            n = n/ 10;  
           }  
              //prints the result  
    System.out.println("Sum of Digits: "+sum);  
      }  
  }  
