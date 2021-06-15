import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double currentSalary;
		double raise=90;
		double newSalary;
		String rating;
		Scanner scan=new Scanner(System.in);
         currentSalary=scan.nextDouble();
         System.out.println("enter the  performance rating(Excellent,good or Poor):");
         rating=scan.nextLine();
         newSalary=currentSalary+raise;
         NumberFormat money=NumberFormat.getCurrencyInstance();
         System.out.println();
         System.out.println("currentSalary:"+money.format(currentSalary));
         System.out.println("Amount o your raise:"+money.format(raise));
         System.out.println("Your newSalary"+money.format(newSalary));
         System.out.println();
        
         
         
	}

}
