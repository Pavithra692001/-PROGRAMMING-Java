
public class Add {

	public static void main(String[] args) {
		int[][] x= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] y= {{21,34,56},{46,78,98},{56,88,90}};
		int[][] z=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.println(z[i][j]+"");
			}
			System.out.println("\n");
		}

	}

}