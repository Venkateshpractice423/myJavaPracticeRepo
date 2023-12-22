package com.java.prac;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int num, fact=1;
		System.out.println("Enter number for factorial");
		Scanner sc=  new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is "+ fact);
	}

}
