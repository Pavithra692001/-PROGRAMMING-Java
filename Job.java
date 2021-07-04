
public class Job {

	public static void main(String[] args) {
		  new Thread(() ->
		  System.out.println("assign a job")).start();
	}

Runnable r=new Runnable() {
	Thread t=Thread.currentThread();
@Override
public void run() {
System.out.println("thread execution logic ");
}
};
Thread t=new Thread();

		
		
}


	
	


