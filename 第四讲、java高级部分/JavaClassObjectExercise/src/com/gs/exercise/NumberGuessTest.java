package com.gs.exercise;

import java.util.Scanner;

public class NumberGuessTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberGuess ng = new NumberGuess();
		int number = 0;
		do {
			System.out.println("输入猜测的数字");
			number = scanner.nextInt();
			if (ng.getV() > number) {
				System.out.println("小了");
			} else if (ng.getV() < number) {
				System.out.println("大了");
			} else {
				System.out.println("猜对了");
			}
		} while (ng.getV() != number);
		scanner.close();
	}

}
