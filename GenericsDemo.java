
public class GenericsDemo {

	public static void main(String[] args) {
		Paint paint=new redpaint();
		goodpaintbrush brush=new goodpaintbrush();
		brush.paint=paint;
		brush.doPaint();
		badpaintbrush bpb=new badpaintbrush();
		bpb.doPaint(2);
		
		
	

	}

}
abstract class Paint{
}
class redpaint extends Paint{
	
}
class bluepaint extends Paint{
	
}
class goodpaintbrush{
	Paint paint;
	public void doPaint(){
	System.out.println(paint);
	}
	
}
class badpaintbrush{
	public void doPaint(int i) {
		if(i==1) {
			
		redpaint rp=new redpaint();
		System.out.println("red paint....."+rp);
	}
		else if(i==2) {
			bluepaint bp=new bluepaint();
			System.out.println("blue paint....."+bp);
		}
	
	}
}