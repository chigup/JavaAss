package JavaAss;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int num = Integer.parseInt(input.next());
		input.close();
		while(num>=1) {
			System.out.print(num%10 + " ");
			num = (int)(num/10);
		}
	}
}
