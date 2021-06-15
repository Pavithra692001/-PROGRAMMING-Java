
public class Employee {
	int empid;
	String empname;
	Employee(int id,String name){
		this.empid=id;
		this.empname= name;
		
	}
	void info()
	{
		System.out.println("id:"+empid+"name:"+empname);
		
		
	}

	public static void main(String[] args) {
		Employee obj1=new Employee(10245,"ammu");
		Employee obj2=new Employee(10345,"pavie");
		obj1.info();
		obj2.info();
		

	}

}
