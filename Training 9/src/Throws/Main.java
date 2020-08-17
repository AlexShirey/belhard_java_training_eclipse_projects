package Throws;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		while (!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc = new Scanner(System.in);
		}

		int n = sc.nextInt();

		try {
			for (int i = -5; i <= 5; i++) {
				if (i == 0) {
					throw new MyExceptions(i + 1);
				}
				System.out.println(n / i);
			}

		} catch (MyExceptions e) {
			System.out.println("my error / 0");
			for (int j = e.i; j <= 5; j++) {
				System.out.println(n / j);
			}

		}

	}

}
