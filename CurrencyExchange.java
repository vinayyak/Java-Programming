import java.util.*; //Java utility package
import java.text.DecimalFormat;


 public class CurrencyExchange { // Class begins
 
	public static void main(String[] args) {
 
	      int choice=0;//switch case variable declaration
	      double amount, usd, gbp, eur, yen, inr; //declaring currency variables
		
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner in = new Scanner(System.in); //Scanner Class
 
		System.out.println("Hello, Welcome to Currency Converter 2022");
 
		System.out.println("Which Currency Would You Like to Convert ? ");
		
		System.out.println("1:Indian Rupee \t2: U.S. Dollar \t3:British Pound \n4:Euro \t5:Japanese Yen "); 
		choice=in.nextInt(); // storing the user's choice
		
		System.out.println("How much Money would you like to convert ?");
		amount = in.nextFloat(); //storing amount entered by the user
 
		// For Sum Conversion
		switch(choice) // switch case
		  {case 1:
                       { usd = amount / 76.5;
			System.out.println("Your " + amount + " Rupee is : " + f.format(usd) + " Dollar");
 
			gbp = amount / 95.75;
			System.out.println("Your " + amount + " Rupee is : " + f.format(gbp) + " Pound");
 
			eur = amount / 80.44;
			System.out.println("Your " + amount + " Rupee is : " + f.format(eur) + " Euro");
 
			yen = amount / 0.59;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
			break;
                }
 
		 case 2: {
			// For Dollar Conversion
 
			inr = amount * 76.5;
			System.out.println("Your " + amount + " Dollar is : " + f.format(inr) + " Rupees");
 
			gbp = amount * 0.80;
			System.out.println("Your " + amount + " Dollar is : " + f.format(gbp) + " Pound");
 
			eur = amount * 0.95;
			System.out.println("Your " + amount + " Dollar is : " + f.format(eur) + " Euro");
 
			yen = amount * 130.28;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
			break;
                }
 
			
		 case 3: {
			// For Pound Conversion
 
			inr = amount * 95.75;
			System.out.println("Your " + amount + " pound is : " + f.format(inr) + " Rupees");
 
			usd = amount * 1.25;
			System.out.println("Your " + amount + " pound is : " + f.format(usd) + " Dollar");
 
			eur = amount * 1.19;
			System.out.println("Your " + amount + " pound is : " + f.format(eur) + " Euro");
 
			yen = amount * 163;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
			break;
                 }
		case 4: {
			// For Euro Conversion
 
			inr = amount * 80.43;
			System.out.println("Your " + amount + " euro is : " + f.format(inr) + " Rupees");
 
			usd = amount * 1.05;
			System.out.println("Your " + amount + " euro is : " + f.format(usd) + " Dollar");
 
			gbp = amount * 0.84;
			System.out.println("Your " + amount + " euro is : " + f.format(gbp) + " Pound");
 
			yen = amount * 136.96;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");

			break;
		} 
		case 5: {
 
			// For Yen Conversion
 
			inr = amount * 0.59;
			System.out.println("Your " + amount + " yen is : " + f.format(inr) + " Ruppes");
 
			usd = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + f.format(usd) + " Dollar");
 
			gbp = amount * 0.006;
			System.out.println("Your " + amount + " yen is : " + f.format(gbp) + " Pound");
 
			eur = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(eur) + " Euro");
                        break;
		}
		
		default: { // default case
			System.out.println("Invalid input");
			break;
		}
		
		
	}
 
   }
}
