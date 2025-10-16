package com.codegnanoperatorexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scanner.nextInt();
		String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))?"it is leap year":"it not leap year";
		System.out.println(result);
		scanner.close();
	}

}
