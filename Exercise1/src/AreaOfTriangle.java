import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Width of triangle");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of  triangle");
		double height = scanner.nextDouble();
		double area =(base*height)/2;
		System.out.println("Area of triangle"+area);

	}

}
