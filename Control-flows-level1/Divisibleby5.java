import java.util.Scanner;
class Divisibleby5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a%5==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}