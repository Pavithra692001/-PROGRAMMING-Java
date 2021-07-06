import java.util.ArrayList;
import java.util.List;

public class GenericsInCollections {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("aaaaaaa");
		list.add("bbbb");
		for(Object ob:list) {
			String s=(String)ob;
			System.out.println(s);
					
			
		}
				
	

	}

}
