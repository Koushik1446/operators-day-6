package com.codegnanoperatorexamples;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in); 
		System.out.println("Enter the marks:");
		int marks = scanner.nextInt();
		char grade = (marks>=90)?'A':
			(marks>=80)?'B':
				(marks>=70)?'C':
					(marks>=60)?'D':
						(marks>=50)?'E':'F';
		System.out.println("student grade is:"+grade);
		scanner.close();					
	}

}
