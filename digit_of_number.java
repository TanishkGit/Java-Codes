package java_program;

import java.util.Scanner;

public class digit_of_number {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		
		int n = sc.nextInt();
		while (n!=0)
		{
			int digit = n%10;
			System.out.println(digit);
			n =n/10;
		}
		

	}

}
