import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner question = new Scanner(System.in); 
		System.out.println("Please enter the first number");
		double x = scanner.nextDouble();
		
		System.out.println("Please enter the second number");
		
		double y=scanner.nextInt();
		
		
		
		 System.out.println("would you like to add, subtract, multiply, or divide these two numbers "); 
		 String answer = question.nextLine();
		 
		 
		if (answer.equalsIgnoreCase("Subtract")) {
		double sum = x - y; 
		System.out.println(x-y); 
		
	
		}else if (answer.equalsIgnoreCase("Add")) {
		double sum = x + y; 
		System.out.println(x+y); 
	
	}else if (answer.equalsIgnoreCase("Multiply")) {
		double sum = x * y; 
		System.out.println(x*y); 
	
	}else if (answer.equalsIgnoreCase("divide")) {
		double sum = x / y; 
		System.out.println(x/y); 
		if (y == 0); {
			System.out.println("Error: Divide by Zero"); 
	}
	
	} 
		}
	 
}
