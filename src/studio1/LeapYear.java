package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert year");
		int n1 = in.nextInt();
		
		boolean year = n1 % 4 == 0 && n1 % 100 != 0 || n1 % 400 == 0;
		System.out.print(year);
		
		
	}

}
