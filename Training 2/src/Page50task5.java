/*
 * Выведите все простые числа до 100.
 */
public class Page50task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 100; i++) {
			for (int n = 2; n <= i;) {
				if (i % n != 0) {
					n++;
				} else {
					break;
				}
				if (i == n) {
					System.out.println(i); // без 2..
				}

			}

		}

	}

}
