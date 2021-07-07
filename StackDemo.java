import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		stack.push("Iron man");
		stack.push("Captain America");
		stack.push("Wonder Women");
		stack.push("Thor");
		stack.push("Hulk");
		System.out.println("Avengers"+stack);
		
		String element1=stack.pop();
		System.out.println("Remove an elements: "+element1);
		
		String element2=stack.peek();
		System.out.println("Top of an elements: "+element2);
		 
		int Position=stack.search("Wonder Women");
		System.out.println("Position of an element: "+Position);
		
		boolean Marvel=stack.empty();
		System.out.println("Is stack is empty ?: "+Marvel);
		
		Iterator itr=stack.iterator();
		while(itr.hasNext()) {
			Object values=itr.next();
			System.out.println(values);
			
			
			
		}
		
		

	}

}
