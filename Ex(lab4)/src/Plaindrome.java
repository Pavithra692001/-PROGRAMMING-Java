import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
	String original,reverse="";
	Scanner in=new Scanner(System.in);
	System.out.println("enter a string/number:");
	original=in.nextLine();
	int length=original.length();
	for(int i=length -1;i>=0;i--)
        reverse=reverse+original.charAt(i);
	if (original.equals(reverse))
		System.out.println("its plaindrome:)");
	else
		System.out.println("not an plaindrome:(");
	
	}

}
