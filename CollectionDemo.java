import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		List  list=new ArrayList<>();
		list.add("hello");
		list.add("Java");
		list.addAll(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("hello"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(0, "hola");
		System.out.println(list);
		Object s[]=list.toArray();
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
			
		}
		
		
		Iterator<String>
		iter=list.iterator();
		while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	System.out.println(iter.hasNext());
	
	ListIterator<String>
	listiter=list.listIterator();
	while(listiter.hasNext()) {
	
	}
while(listiter.hasPrevious()) {
	System.out.println(listiter.previous());
	{
	
	
	
	
		
		
		}
		

		
	}

	}
}
