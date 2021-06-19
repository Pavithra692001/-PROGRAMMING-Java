import java.util.Scanner;

public class OddRange {

	public static void main(String[] args) {
		int r,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the second number");
		int num2=scan.nextInt();
		System.out.println("\n display odd number between"+num1+" and "+num2+" are:\n");
		i=num1;
		do {
			r=i%2;
			if(r==1)
				System.out.println(i);
			i++;
		}while(i<=num2);

	}

}
