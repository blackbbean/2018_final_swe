package final_2018_winter;

import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	}

	
	public int add(int input1,int input2) {
		int result = input1+input2;
		return result;
	}
	
	public int multiply(int input1,int input2) {
		int result = input1*input2;
		return result;
	}
	
	public int subtract(int input1,int input2) {
		int result = input1-input2;
		return result;
	}
	
	public void print() {
		
		System.out.println("[ID: 1774889]");
		System.out.println("[Name:김민정]");
		System.out.println("");
		while (true){
			System.out.println("1.Add two numbers");
			System.out.println("2.Subtract twon numbers");
			System.out.println("3.Multiply twon numbers");
			System.out.println("4.Quit");
			Scanner in =new Scanner(System.in);
		
			int choice = in.nextInt();
			if (choice==4)
				break;
			else {
				System.out.println("input two numbers:");
				int number1 = in.nextInt();
				int number2 = in.nextInt();
				int result = -100;
				if(choice==1) 
					result =add(number1,number2);
				else if(choice==2) 
					result=subtract(number1,number2);
				else if(choice==3)
					result=multiply(number1,number2);
				else
					System.out.println("Exception Occurred");
				
				System.out.println(result);
			}
			
		}
		
	}
}
