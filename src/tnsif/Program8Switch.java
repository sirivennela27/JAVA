package tnsif;

import java.util.Scanner;

public class Program8Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Src = new Scanner(System.in);
		System.out.println("VIBGYOR SPECTRUM");
		System.out.println("enter your colour choice");
		char color= Src.next().charAt(0);
		switch (color) {
		case'v':
			System.out.println("violet");
			break;
		case'I':
			System.out.println("Indigo");
			break;
		case'B':
			System.out.println("Blue");
			break;
		case'G':
			System.out.println("Green");
			break;
		case'Y': 
			System.out.println("Yellow");
			break;
		case'O':
			System.out.println("Orange");
			break;
		case'R':
			System.out.println("Red");
			break;
		default:
			System.out.println("incorrect choice");
			
		}
		

	}

}
