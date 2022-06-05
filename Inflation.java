import java.util.Scanner;

public class Inflation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double cost, rate, copycost;
		int years;
		
		System.out.print("Enter the cost: ");
		cost = in.nextDouble();
		System.out.print("Enter the Years: ");
		years = in.nextInt();
		System.out.print("Enter the retail inflation rate: ");
		rate = in.nextDouble();
		
		copycost = cost; 
			
		System.out.printf("Year "+ 0 + " ==> $ %.2f%n", cost); 
		
		for (int i = 1; i <= years; i++){
	        
			double amount = cost + (cost*(rate/100)); //amount to be paid calculated
	        
			if (i < years) {   
				System.out.printf("Year "+ i + " ==> $ %.2f %n", amount );
			}
			   else {          
				System.out.printf("\r\n" + "==== Final Amount Calculated ==="+ "\r\n");
				System.out.printf("This item of $"+ copycost + " will cost $%.2f", amount );
				System.out.printf(" after " + i +" years"); }
			
			cost = amount;
		}
		
		in.close();
	}

}
