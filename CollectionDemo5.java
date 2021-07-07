
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo5{
	public static void main(String[] args) {
		Set<String>set=new TreeSet<String>();
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

