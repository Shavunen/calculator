import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the first number");
		int x = scanner.nextInt();
		
		System.out.println("Please enter the second number");
		int y=scanner.nextInt();
		
		int sum = x + y; 
		
			
		 System.out.println("This is the sun of your inputs "+ sum); 
					
		

	}

}
