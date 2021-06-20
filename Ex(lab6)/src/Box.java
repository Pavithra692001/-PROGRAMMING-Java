
public class Box {

	
	 int length,breadth,height;
	 Box(int l,int b,int h)
	 {
		 length=l;
		 breadth =b;
		 height=h;
	 }
	 public void display() {
		 int volume=length*breadth*height;
		 System.out.println("volume of box "+volume);
	 
	 
	 }
	 

	}


class  Boxdemo{
	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		b.display();

	}
	
}
