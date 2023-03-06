package basicPrograms;

import java.util.Scanner;

class SimpleCalculatorWithContinue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yn;
		do {
			System.out.println("Enter first number");
			int num1 = s.nextInt();
			System.out.println("Enter Second number");
			int num2 = s.nextInt();
			System.out.println("Enter the condition you want to calculate(+,-,*,/)");
			String condition = s.next();
			int result;

			switch (condition) {
			case "+":
				result = num1 + num2;
				System.out.println("Addition of two numbers is:" + result);
				break;

			case "-":
				result = num1 - num2;
				System.out.println("Subtraction of two numbers is:" + result);
				break;

			case "*":
				result = num1 * num2;
				System.out.println("Multiplication of two numbers is:" + result);
				break;

			case "/":
				result = num1 / num2;
				System.out.println("Division of two numbers is:" + result);
				break;
			default:
				System.out.println("Invalid condition");
				break;

			}
			System.out.println("Do you want to continue(Press y for Yes and n for No)");
			yn = s.next();
		} while (yn.equals("y") || yn.equals("Y"));

	}
}
