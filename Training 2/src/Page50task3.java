/*
 * C помощью цикла for подсчитайте сумму всех четных чисел в диапазоне от -20 до 20.
 * 
 */

public class Page50task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = -20; i <= 20; i++) {
			if (i % 2 == 0 && i != 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
