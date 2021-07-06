
public class ClassLock {
	public static void main(String[] args) {
		sample obj1=new sample();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(sample.class) {
			
				obj1.met1();
				}
				
			}
		}).start();
		sample obj2=new sample();
		new  Thread(new Runnable()
		{
			
			public void run() {
				synchronized(sample.class) {
				obj2.met2();
				}
				
			}
		}).start();

	}


		static class sample{
			static int money=1000;
		public void met1() {
			money=money+100;
			try {
				Thread.sleep(10000);
			}
			catch(Exception e) {}
			System.out.println("method 1 of thread1 :"+money);
			
			
		}
		public  void met2() {
			money=money+200;
			System.out.println("method2 of threaad2 : "+money);
		}
		}
}
