package warmup;

import java.util.Scanner;

/*
 *This is an introductory challenge. The purpose of this challenge is to give you a working I/O template in your preferred language. It includes scanning two integers from STDIN, calling a function, returning a value, and printing it to STDOUT.

The task is to scan two numbers from STDIN, and print the sum A+B on STDOUT. The code has already been provided for most of the popular languages. This is primarily for you to read and inspect how the IO is handled.

Note: The code has been saved in a template, which you can submit if you want. Or, you may try rewriting it and building it up from scratch.

Input Format 
(This section specifies the Input Format.) 
Given A and B on two different lines.

Output Format 
(This section specifies the Output Format.) 
An integer that denotes Sum (A+B)
Constraints 
(This section tells what input you can expect. You can freely assume that the input will remain within the boundaries specified. As an example here given below, A and B will never be below 1 or above 1000.) 
1≤A,B≤1000
 */

public class SolveMeFirst {
	/*
	 * Sample Input
			
			2
			3
			Sample Output

			5
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		int sum=solveMeFirst(num1,num2);
		System.out.println(sum);
		
		

	}

	private static int solveMeFirst(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
