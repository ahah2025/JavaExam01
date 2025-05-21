package com.javaex.ex02;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		System.out.print("단:");

		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);

			if (dan <= 2) {

			} else if (dan <= 9) {

			} 
		}
		
		if(dan != 13) { //!= 입력 x 
			
		}else if(dan == -5)	{

		}else {
			System.out.println("2단에서 9단까지만 출력가능합니다");
		}
		
		sc.close();
	}
}
/*
단을 입력하세요
단:13
13*1=13
13*2=26
13*3=39
13*4=52
13*5=65
13*6=78
13*7=91
13*8=104
13*9=117
2단에서 9단까지만 출력가능합니다
*/