import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner question = new Scanner(System.in); 
		System.out.println("Please enter the first number");
		int x = scanner.nextInt();
		
		System.out.println("Please enter the second number");
		
		int y=scanner.nextInt();
		
		
		
		 System.out.println("would you like to add or subtract these two numbers "); 
		 String answer = question.nextLine();
		 
		 
		if (answer.equalsIgnoreCase("Subtract")) {
		int sum = x - y; 
		System.out.println(x-y); 
		
	
		}else if (answer.equalsIgnoreCase("Add")) {
		int sum = x + y; 
		System.out.println(x+y); 
	}
}
		}
	 
	
