import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of row");
		int a=in.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<i;j++)
				System.out.println(j);
			for(int k=i;k>=1;k--)
				System.out.println(k);
			System.out.println("\n");
		}

	}

}
