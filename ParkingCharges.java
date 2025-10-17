package com.codegnanoperatorexamples;

import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the hours ");
		int hours = scanner.nextInt();
		int fee = (hours<=3)?(hours*2):(3*2+(hours-3)*1);
		System.out.println(fee);
		scanner.close();
	}

}
