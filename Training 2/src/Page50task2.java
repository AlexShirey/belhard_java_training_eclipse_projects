import java.util.Scanner;

/*
 * Вывести все числа кратные 5 от 0 до введенного числа и посчитать их количество.
 */

public class Page50task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		while (!sc.hasNextInt()) {
			System.out.println("Enter number");
			sc.nextLine();
		}

		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				count++;
				System.out.println(i);
			}

		}
		System.out.println("Count: " + count);

	}

}
