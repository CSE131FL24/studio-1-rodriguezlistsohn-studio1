package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean is0rdered = true; 
		if((x > y && y > z) || (z > y && y > x)) {
			is0rdered = true;
		} else {
			is0rdered = false;
		}
		
		System.out.println(is0rdered); 

	}

}
