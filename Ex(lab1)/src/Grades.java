import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		double grade;
		double sumofGrades;
		int numstudents;
		
		int numpass;
		int numfail;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n grades processing programs\n");
		sumofGrades=0;
		numstudents=0;
		numpass=0;
		numfail=0;
		System.out.println("enter the first grade:");
		grade=scan.nextDouble();
		while(grade>=0) {
			sumofGrades=sumofGrades+grade;
			numstudents=numstudents+1;
			if(grade<60) 
				numfail=numfail+1;
			else
				numpass=numpass+1;
			System.out.println("enter the  next grade(a negative to quit):");
			grade=scan.nextDouble();
		}
		if(numstudents>0)
		{
			System.out.println("\nGrade summary");
			System.out.println("class average"+sumofGrades/numstudents);
			System.out.println("no of pasing grades:"+numpass);
			System.out.println("no of failimg grades:"+numfail);
			
			
			
			
				
			}
		else
			System.out.println("no grade processed");
			
		}
		
		

	}


