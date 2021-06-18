import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int l,b,perimeter,area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  length of Rectangle: " );
		l=s.nextInt();
		System.out.println("enter the breadth of Rectangle");
		b=s.nextInt();
		area=l*b;
		System.out.println("area ofRectangle: "+area);
		perimeter=2*(l+b);
		System.out.println("perimeter of Rectangle:"+perimeter);
		

	}

}
