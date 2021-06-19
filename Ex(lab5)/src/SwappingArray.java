import java.util.Scanner;

public class SwappingArray {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  no of elemnt in array :");
	    size=sc.nextInt();
	    int[]a=new int [size];
	    int[]b=new int[size];
	    System.out.println("enter the "+size+"element of first array:");
	    for(i=0;i<size;i++) {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("enter"+size+"element of second array :");
	    for(i=0;i<size;i++) {
	    	b[i]=sc.nextInt();
	    }
	    for(i=0;i<size;i++)
	    {
	    	a[i]=a[i]+b[i];
	    	b[i]=a[i]-b[i];
	    	a[i]=a[i]-b[i];
	    
	    }
	    System.out.println("\n first element of an array(a[])after swapping : ");
	    printattay(a,size);
	    System.out.println("\n second element of an array(b[])after swapping:");
	    printattay(b,size);
	    
}
	public static void printattay(int[]array, int size ) {
		
		for(int number:array) {
			System.out.println(number+"");
		
	}
	    
	    

	}
}


