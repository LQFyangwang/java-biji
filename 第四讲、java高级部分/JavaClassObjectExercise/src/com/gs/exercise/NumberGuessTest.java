package com.gs.exercise;

import java.util.Scanner;

public class NumberGuessTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberGuess ng = new NumberGuess();
		int number = 0;
		do {
			System.out.println("����²������");
			number = scanner.nextInt();
			if (ng.getV() > number) {
				System.out.println("С��");
			} else if (ng.getV() < number) {
				System.out.println("����");
			} else {
				System.out.println("�¶���");
			}
		} while (ng.getV() != number);
		scanner.close();
	}

}
