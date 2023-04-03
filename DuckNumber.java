import java.util.Scanner;

class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		while(num > 0)
		{
			int rem = num % 10;
			
			if(rem == 0)
			{
				System.out.println("It's Duck Number");
			}
			num /= 10;
		}
	}
}
