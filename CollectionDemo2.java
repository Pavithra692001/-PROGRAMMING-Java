import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		List<String>list=new LinkedList<String>();
		list.add("Dogs");
		list.add("Cats");
		list.add("Rabbit");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("snake"));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(1, "Dove");
		System.out.println(list);
		Object s[]=list .toArray();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		for(String ss:list) {
			System.out.println(ss);
			
		}
		Iterator<String>
iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			}
		System.out.println(iter.hasNext());
		ListIterator<String>
		listiter=list.listIterator();
		while(listiter.hasPrevious()) {
			System.out.println(listiter.hasPrevious());
			
			
		}
		
	}

}
