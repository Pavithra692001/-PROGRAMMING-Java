
public class LargestAndSmallest {
	public static void main(String[] args) {
		int number[]=new int[] {45,67,78,99,45,34};
		int smallest=number[0];
		int largest=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest)
				largest=number[i];
			else if(number[i]<smallest)
				smallest=number[i];
				
		}
		System.out.println("largest number :"+largest);
		System.out.println("samllest number :"+smallest);
		
	}

}
