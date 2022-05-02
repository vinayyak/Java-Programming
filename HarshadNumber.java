import java.util.Scanner;
public class HarshadNumber  
{  
    public static void main(String[] args)
    { 
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter No. to check if Harshad or not");
        n=in.nextInt();
        int d = 0, sum = 0, copy;  
          
        //Make a copy of n
        copy = n;  
          
        //Calculates sum of digits  
        while(n > 0){  
            d = n%10;  // extracting digits
            sum = sum + d;  
            n = n/10;  
        }  
          
        //Checks whether number is divisible by sum of digits  
        if(copy%sum == 0)  
            System.out.println(copy + " is a Harshad number");  
        else  
            System.out.println(copy + " is not a Harshad number");  
    }  
}  