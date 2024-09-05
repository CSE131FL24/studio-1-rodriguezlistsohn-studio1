package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What Year? ");
		int year = in.nextInt();
		// Check mod 4
		int mod4 = year % 4;
		int mod100 = year % 100; 
		int mod400 = year % 400; 
		boolean mod = true;
		if((mod4 == 0 && mod100 != 0) || (mod400 == 0)) {
			mod = true; 
		} else {
			mod = false;
		}
		//Print output
		System.out.println(year + " is a leap year: " + mod);
	}

}
