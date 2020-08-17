import java.util.Scanner;

/*
 * 
 * Ввывести все делители введенного числа.
 */
public class Page50task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		while (!sc.hasNextInt()) {
			System.out.println("Enter number");
			sc.nextLine();
		}

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

}
