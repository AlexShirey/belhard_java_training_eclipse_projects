import java.util.Scanner;

/*
 * организуйте бесконечный цикл, выводящий факториал числа, введенного с клавиатуры
 * выход из цикла с помощью break;
 */
public class Page48task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {

			if (sc.hasNextInt()) {
				long n = sc.nextInt();
				long x = n;
				while (n > 1) {
					x = x * (n - 1);
					n--;
				}
				System.out.println(x);

			}

			else {
				break;
			}

		}

	}

}
