
public class ReverseArray {

	public static void main(String[] args) {
		int[]array=new int[] {1,2,3,4,5};
		System.out.println("original array:)");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+"");
			
		}
		System.out.println();
		System.out.println("array in reverse order :");
		for(int i=array.length-1;i>=0; i--)
{
	System.out.println(array[i]+"");
}
		
		
	}

}
