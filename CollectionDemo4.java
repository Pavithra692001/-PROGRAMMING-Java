import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo4 {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("dogs");
		set.add("cats");
		set.add("butterfly");
		System.out.println(set);
		set.add("rabbit");
		set.add("birds");
		System.out.println(set);
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		for(String s:set) {
			System.out.println(s);
		}
		

	}

}
