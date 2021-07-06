import java.util.StringTokenizer;

public class Linear {

	public static void main(String[] args) {
		String str="java,python,sql";
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens())
			
		{
			System.out.println(st.nextToken());
		}
		

	}

}
