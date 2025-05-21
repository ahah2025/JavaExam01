package com.javaex.ex03;

public class PersonApp {

	public static void main(String[] args) {

		Person[] pArray = new Person[3];
		
		Person p01 = new Person("유재석","010-1111-1111","02-1111-1111");
		Person p02 = new Person("이효리","010-2222-2222","02-2222-2222");
		Person p03 = new Person("박명수","010-3333-3333","02-3333-3333");
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		/*
		p01.toString();
		p02.toString();
		p03.toString();
		*/
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
	}
}
