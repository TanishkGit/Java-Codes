//WAJP to find product of sum of all even digits and sum of all and digits 
package java_program;

public class product {

	public static void main(String[] args)
	{
		int n = 1684;
		int even=0;
		int odd=0;
		int sum=0;
		while (n!=0)
		{
			int digit = n%10;
			if (digit%2==0)
			{
				even = even +digit; 
			}
			else
			{
				odd = odd + digit;
			}
			n =n/10;
		}
		System.out.println(even*odd);

	}

}
