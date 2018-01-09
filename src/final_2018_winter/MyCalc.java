package final_2018_winter;

import java.util.Scanner;

public class MyCalc {
	
	private final static int ADD =1;
	private final static int SUBTRACT =2;
	private final static int MULTIPLY=3;
	private final static int QUIT = 4;

	public static int add(int input1,int input2) {
		int result = input1+input2;
		return result;
	}
	
	public static int multiply(int input1,int input2) {
		int result = input1*input2;
		return result;
	}
	
	public static int subtract(int input1,int input2) {
		int result = input1-input2;
		return result;
	}
	
	public static void printManual() {
		
		System.out.println("[ID: 1774889]");
		System.out.println("[Name:김민정]");
		System.out.println("");
		System.out.println("1.Add two numbers");
		System.out.println("2.Subtract two numbers");
		System.out.println("3.Multiply two numbers");
		System.out.println("4.Quit");
	}
			
	public static void execute(int menuChoice,int input1,int input2) {
		int result=-10000;
		if (menuChoice==ADD)
			result = add(input1,input2);
		else if(menuChoice==SUBTRACT)
			result = subtract(input1,input2);
		else if(menuChoice == MULTIPLY)
			result = multiply(input1,input2);
		System.out.println("Result:"+result);
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		printManual();
		int menuChoice = in.nextInt();
		if (menuChoice ==QUIT)
			System.exit(0);
		
		System.out.println("Input two numbers");
		System.out.println("x:");
		int userInput1 = in.nextInt();
		System.out.println("y:");
		int userInput2 = in.nextInt();
		
		execute(menuChoice,userInput1,userInput2);
		
		
	}

	
}
