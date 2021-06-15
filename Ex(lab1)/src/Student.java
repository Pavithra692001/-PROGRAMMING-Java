
public class Student {
	String name,city;
	int age;
	static int m;
	void printData()
	{
		System.out.println("Student name="+name);
		System.out.println("Student city="+city);
		System.out.println("Student age="+age);
	}
	}
class stest{
	
	public static void main(String[] args) { 
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Paviee;";
		s1.city="kovai";
		s1.age=19;
		s2.name="Shruz";
		s2.city="trichy";
		s2.age=21;
		s2.printData();
		s1.printData();
		s1.m=20;
		s2.m=27;
		Student.m=28;
		System.out.println("s1.m="+s1.m);
		System.out.println("s2.m="+s2.m);
		System.out.println("Student.m="+Student.m);
		
		

	}

}
