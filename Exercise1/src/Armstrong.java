
public class Armstrong {

	public static void main(String[] args) {
		int number =371,originalNumber,remainder,result=0;
		originalNumber = number;C:\Users\New\Downloads\Week2-WorkBook.pdf
		while(originalNumber !=0) {
			remainder=originalNumber % 10;
			result+=Math.pow(remainder,3);
			originalNumber/=10;
			
		}
		if(result == number)
			System.out.println(number+"is an Armstrong.");
		else
			System.out.println(number+"is not an Armstrong.");

	}

}
