
public class Overloading {
	void addition(int a,int b) {
		int sum=a+b;
		System.out.println("sum of two numbers :"+sum);
	}
	void addition(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum of three numbers :"+sum);
		
	}

	public static void main(String[] args) {
		Overloading ovl=new Overloading();
		ovl.addition(4, 2);
		ovl.addition(10, 20, 30);

	}

	
}
