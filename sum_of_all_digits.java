package java_program;

public class sum_of_all_digits {

	public static void main(String[] args) 
	{
		int n = 1684;
		int sum =0;
		while (n!=0) {
			int digit = n%10;
			sum = sum + digit;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
