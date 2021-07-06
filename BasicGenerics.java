
public class BasicGenerics {

	public static void main(String[] args) {
		ball obj=new ball();
		sky sky=new sky();
		RightAccept<ball>raccept=new RightAccept<>();
		raccept.setT(obj);
		RightAccept<sky>raccept2=new RightAccept<>();
		raccept2.setT(sky);
		ball ball=raccept.getT();
		sky s=raccept2.getT();
		}
	}
class sky{
	
	
}
class ball{
	
}
class RightAccept<T>{
	T obj;
	public T getT() {
		return obj;  
	}
	public void setT(T obj)
	{
		this. obj=obj;
	}
}
class accept{
	Object obj;
	public void process() {
		if(obj instanceof ball) {
			ball ball=(ball)obj;
			System.out.println(ball);
		}
		else if (obj instanceof sky) {
			sky sky=(sky)obj;
			System.out.println(sky);
		}
			
		
	}
	
}
