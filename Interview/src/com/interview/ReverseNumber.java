package com.java.prac;

import java.util.Scanner;

/**
 * @author Venkatesh
 */
public class ReverseNumber {

	public static void main(String[] args) {
		
		int temp,rev=0, num;
		System.out.println("Enter number to reverse:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Entered number is :"+num);
		while(num!=0) {
			rev=rev*10;
		    rev=rev+num%10;
		    num=num/10;
		}
		System.out.println("Reverse of given number :"+rev);
		
	}

}
