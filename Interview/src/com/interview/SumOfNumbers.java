package com.java.prac;

import java.util.Scanner;
/**
 * @author Venkatesh
 */
public class SumOfNumbers {

	public static void main(String[] args) {
		int num, sum=0;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println("Sum of "+num+" numbers: "+sum);
	}

}
