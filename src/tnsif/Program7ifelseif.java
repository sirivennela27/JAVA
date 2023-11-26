package tnsif;

import java.util.Scanner;

public class Program7ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("the cash how much ur having");//pen=10;  notebook=40;
		int cash=src.nextInt();
		if(cash<10)
		{
			System.out.println("cant buy anything");
			System.out.println("get more cash");
		}
		else if(cash >10 && cash<40)
		{
			System.out.println("can buy pen");
			
		}
		else
			System.out.println("can buy both");

	}

}
