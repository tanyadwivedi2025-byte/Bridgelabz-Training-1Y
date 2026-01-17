import java.util.Scanner;
class Distance
{
	public static void main(String args[])
	{
		double rKm=6378;
		double pie=3.14;
		double volumeKm=(4.0/3)*pi*rKm*rKm*rKm;
		
		double rMiles=rKm/1.6;
		double volumeMiles=(4.0/3)*pi*rMiles*rMiles;
		
		System.out.println("The volume of earth in cubic kilometers is cubic kilometers is"+volumekm);
		System.out.println("The volume of earth in cubic miles is"+volumeMiles);
	}
}
