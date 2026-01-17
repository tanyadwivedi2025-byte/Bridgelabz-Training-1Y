import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Kilometer:-");
		double kilometer=sc.nextDouble();
		double miles=kilometer*1.6;
		System.out.println("converter:-"+miles);
	}
}
