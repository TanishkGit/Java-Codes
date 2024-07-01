package java_program;

import java.util.Iterator;
import java.util.Scanner;

public class prime_number {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n% i==0)
			{
				count++;
			}
		}
		if(count ==2)
		{
			System.out.println("prime number");
			
		}
		else 
		{
			System.out.println("not prime number");
		}
		

	}

}
