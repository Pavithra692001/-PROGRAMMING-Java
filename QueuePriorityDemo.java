import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityDemo {

	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue<String>();
		queue.offer("Earth");
		queue.offer("Mars");
		queue.offer("Jupiter");
		queue.add("Moon");
		queue.add("Stars");
		queue.add("Pulot");
		System.out.println("Planets : "+queue);
		
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
