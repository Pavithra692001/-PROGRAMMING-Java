import java.util.Scanner;

public class SquareDemo {

	public static void main(String[] args) {
		System.out.println("Enter side of the square:");
		Scanner scanner=new Scanner(System.in);
        double side= scanner.nextDouble();
        double area=side*side;
        System.out.println("Area of Square is:"+area);
		

	}

}
