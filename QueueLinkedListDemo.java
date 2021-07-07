import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<String>();
		queue.offer("Persian Cats");
		queue.offer("Bengal Cats");
		queue.offer("Maine Coon Cats");
		queue.add("Cailco Cats");
		queue.add("Siamese");
		queue.add("Birman");
		System.out.println("Cats "+queue);
		
		String element1=queue.peek();
		System.out.println("Access  an element: "+element1);
		
		String element2=queue.poll();
		System.out.println("Remove an element: "+element2);
		
		String element3=queue.element();
		System.out.println("elements: "+element3);
		
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<String>itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	
		
		
		
		

	}

}
