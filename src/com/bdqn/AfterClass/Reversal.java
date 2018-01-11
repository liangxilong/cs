package com.bdqn.AfterClass;

import java.util.Scanner;

/**
 * 反转
 * @author   Lucas
 *
 */
public class Reversal {

	public static void main(String[] args) {
		reversal();
		
	}
	private static void reversal() {
		Scanner input =  new Scanner(System.in);
		System.out.println("请输入:");
		String number = input.nextLine();
		
		String[] ch = number.split(" ");
		for (int i = 0; i < ch.length; i++) {
			
			String[] ch1 = ch[i].split("");
			for (int j = ch1.length - 1; j >= 0; j--) {
				System.out.print(ch1[j] );
			}
			System.out.print(" ");
			
		}
	}

}
