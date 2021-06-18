
public class Swapped {
	public static void main(String[] args) {
		int num1=20,num2=30;
		System.out.println("**before swap**");
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		System.out.println("**after swap**");
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
	}

}
