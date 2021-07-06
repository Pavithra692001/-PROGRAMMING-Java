import java.util.ArrayList;
import java.util.List;

public class EmployeArrayList {

	public static void main(String[] args) {
		List employeelist=new ArrayList();
		employeelist.add(new employee("ranbir",50000));
		employeelist.add(new employee("shradhha",90000));
		employeelist.add(new employee("anushaka",80000));
		int size=employeelist.size();
		for(int i=0;i<3;i++) {
			employee employee=(employee)employeelist.get(i);
			System.out.println(employee.toString());
		}
		
		

	}

}
class employee{
	
	
	
	private String name;
	private long salary;
	public employee(String name,long salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getname() {
		return name;
		
	}
	public long getsalary() {
		return salary;
	}
	public String toString () {
		return "name :"+getname()+"\n"+"salary of" + getname()+ ":"+getsalary();
	}
		
	}
	
	

