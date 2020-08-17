/*
 * создать двумерный массив из 7 строк по 4 столбца в каждой из случайных чисел отрезка 
 * [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением
 * элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Page67task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[7][4];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 11 - 5);
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		int n = 0;
		int max = 1;
		int maxi = 1;

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				maxi = maxi * Math.abs(mass[i][j]);
			}

			System.out.println("max = " + maxi);

			if (maxi == max) {
				continue;
			}

			if (maxi > max) {
				max = maxi;
				n = i;
			}
			maxi = 1;

		}

		System.out.println("строка " + n);

	}

}
