import java.util.Scanner;
public class pinverification {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pin = 5248;
		int count = 0;
		
		
		
		for(int i = 0; i<=3 ; i++)
			{
			   System.out.println("Welcome to state bank of india");
		       System.out.println("Enter Your Pin: ");
		       int my_pin= scan.nextInt();
		
		  if(my_pin == pin)
		{
			System.out.println("Correct, Wellcom Back");
			break;
		}
		  else {
			  count++;
			  if(count>=3) {
				  System.out.println("Sorry Your Account is Locked");
			  }
			  System.out.println("Incorret , Try Again");
		  }
	        

	}
	}
}
