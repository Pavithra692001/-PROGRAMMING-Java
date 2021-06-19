import java.util.Scanner;

public class PrimeWhile {

	public static void main(String[] args) {
		System.out.println("enter a number  :");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int i=2,count=0;
		while(i<=number/2) {
			if(number%i==0) {
				count++;
				break;
			}
		i++;
	}
	if(count==0) {
		System.out.println(number+" is a prime number:)");
	}
	else
	{
		System.out.println(number+" not an prime number");
		
	}
	}
}



	


