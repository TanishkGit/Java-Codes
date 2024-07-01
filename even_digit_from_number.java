//Wajp to print all the even digits 
package java_program;

public class even_digit_from_number {

	public static void main(String[] args)
	{
		int n = 1684;
		while (n!=0)
		{
			int digit = n%10;
			if (digit%2==0)
			{
				System.out.println(digit);
			}
			
			n =n/10;
		}

	}

}
