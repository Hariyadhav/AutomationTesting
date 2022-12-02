package corejava;

import java.util.Scanner;

public class Scaneer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			int b;
			int c;
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the first number");
		    a = sc.nextInt();
			System.out.print("Enter the second number");
			b = sc.nextInt();
			c = (a>b)?a:b;
			
			System.out.println("the largest number is: " +c );
			
	}

}
