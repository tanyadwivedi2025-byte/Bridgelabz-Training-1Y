import java.util.Scanner;
class Price
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity:-");
		int Quantity =sc.nextInt();
		System.out.println("Enter Price:-");
		int price=sc.nextInt();
		int Total_Price=Quantity*Price;
		System.out.println("Enter total price:-"+Toatl_Price);
	}
}
