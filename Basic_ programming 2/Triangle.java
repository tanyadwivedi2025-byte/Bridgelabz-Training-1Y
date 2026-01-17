import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scannersc= new Scanner(System.in);
		
		System.out.println("Enter h in cm:-");
		double h=sc.nextInt();
		System.out.println("Enter b in cm:-");
		double Area_cm=b*h*0.5;
		double Area_inc = Area_cm/(2.54*2.54);
		System.out.println("area of triangle in cm:-"+Area_cm);
		System.out.println("area of triangle in inch:-"+Area_inch);
	}
}
