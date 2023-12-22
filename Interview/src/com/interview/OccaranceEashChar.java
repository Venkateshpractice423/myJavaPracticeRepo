package com.java.prac;

import java.util.Scanner;

public class OccaranceEashChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		sc.close();
		int c[]=new int[128];
		for(int i=0;i<str.length();i++) {
			c[str.charAt(i)]++;
			//System.out.println(c[str.charAt(i)]);
			//System.out.println(c[str.charAt(i)]++);
			
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i]!=0) {
				System.out.println((char)i+"---->"+c[i]);
			}
		}
		
	}

}
