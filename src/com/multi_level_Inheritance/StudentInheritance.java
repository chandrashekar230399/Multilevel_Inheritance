package com.multi_level_Inheritance;

import java.util.Scanner;

class Student{
	public void show(int sno,String name) {
		System.out.println("student details");
	}
}
class Test extends Student{
	
	public void view(int sub1,int sub2,int sub3) {
		System.out.println("sub1 marks"+sub1);
		System.out.println("sub2 marks"+sub2);
		System.out.println("sub3 marks"+sub3);
	}
}
class Result extends Test{
	int total,avg;
	public void Cal_display(int sno,String sname) {
		super.show(sno, sname);
	}
	public void see(int sub1,int sub2,int sub3) {
		
		super.view(sub1, sub2, sub3);
		
		total=sub1+sub2+sub3;
		System.out.println("All Subject Marks : "+total);
		
		if(sub1<35 || sub2<35 || sub3<35) {
			System.out.println("fail");
		}
		else {
			System.out.println("hurray..!i am passed");
			
			avg=total/3;
			System.out.println("Avg Marks : "+avg);
		
		
		 if( avg>75) {
			System.out.println("Grade A "); 
		}
		
		else if(avg<=75 && avg>65) {
			System.out.println("Grade B ");
		}
		else if(avg<=65 && avg>55) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("FAIL");
		}
		
	  }	
	}
}
public class StudentInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details:");
		
		System.out.println("Enter student rollnumber:");
		int sno = sc.nextInt();
		System.out.println("Enter student name:");
		String sname = sc.next();
		System.out.println("Enter student Marks:");
		System.out.println("Enter subject1 marks");
		int sub1 = sc.nextInt();
		System.out.println("Enter subject2 marks");
		int sub2 = sc.nextInt();
		System.out.println("Enter subject3 marks");
		int sub3 = sc.nextInt();
		
		Result r = new Result();
		
		r.Cal_display(sno, sname);
		r.see(sub1, sub2, sub3);
	}

}
