package com.bdqn.AfterClass;

import java.util.Scanner;
/**
 * 不为空  
 * @author   Lucas
 *
 */
public class NULL {

	public static void main(String[] args) {
		boolean bls = Null();
		if(bls) {
			System.out.println("是空");
		}else {
			System.out.println("不是空");
		}
	}
	private static boolean Null() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入:");
		String n = input.nextLine();
		boolean bl = false;
		
		if(n == null ) {
			bl = true;
			
		}
		String[] str = n.split("");
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {
				bl = true;
			}else if(!str[i].equals(" ")) {
				bl = false;
				break;
			}
		}
		return bl;
	}

}
