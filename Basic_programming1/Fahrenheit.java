import java.util.Scanner;
class Faherenheit
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:-");
		double c=sc.nextDouble();
		double f=(c*9.0/5)+32;
		System.out.println("Temperature in Faherenheit="+f);
	}
}
