package tnsif;

import java.util.Scanner;

public class persondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the person details");
		String name=sc.nextLine();
		int age=sc.nextInt();
		int income=sc.nextInt();
		int tax=sc.nextInt();
		String gender=sc.next();
		
		 obj.setName(name);
		 obj.setAge(age);
		 obj.setIncome(income);
		 obj.setTax(tax);
		 obj.setGender(gender);
		 System.out.println(obj);
		 

	}

}
