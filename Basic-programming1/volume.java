import java.util.Scanner;
class volume
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height:-");
		int height=sc.nextInt();
		System.out.println("Enter radius:-");
		int radius=sc.nextInt();
		double volume = 3.14*radius*radius*height;
		System.out.println("Find the volume:-"+volume);
	}

}

