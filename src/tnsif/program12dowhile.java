package tnsif;

import java.util.Scanner;

public class program12dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src= new Scanner(System.in);
		int number=0;
		do {
			System.out.println("enter the number");
			number=src.nextInt();
			System.out.println("here is your number");
			System.out.println(number);
		}while(number>=0);
		

	}

}
