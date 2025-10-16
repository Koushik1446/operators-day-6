package com.codegnanoperatorexamples;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = scanner.nextInt();
		String result = (i%2>0)?"it is odd":"it is even";
		System.out.println(result);
		scanner.close();
	}

}
