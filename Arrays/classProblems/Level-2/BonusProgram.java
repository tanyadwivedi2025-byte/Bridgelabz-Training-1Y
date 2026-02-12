import java.util.Scanner;
public class import java.util.Scanner;

public class BonusProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] emp = new double[10][2];   // [][0] = salary, [][1] = years
        double[][] result = new double[10][2]; // [][0] = bonus, [][1] = new salary

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Enter again.");
                i--;   // decrement index to repeat
                continue;
            }

            emp[i][0] = salary;
            emp[i][1] = years;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            double salary = emp[i][0];
            double years = emp[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;   // 5% bonus
            } else {
                bonus = salary * 0.02;   // 2% bonus
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Printing totals
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
