package com.codegnanoperatorexamples;

import java.util.Scanner;

public class TernanryOperatorEaxample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		String result = (num<0)?"number is negative":"number is positive";
		System.out.println(result);
		scanner.close();
	}

}
