/*
 * Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел отрезка 
 * [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке
 * стоял ее наибольший элемент. при этом изменять состав массива нельзя, а можно только переставлять элементы
 * в рамках одной строки. Порядок остальных элементов не важен.
 * Вывести преобразованный массив на экран
 */
public class Page74task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[6][7];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		int maxi = 0;
		int n = 0;

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > maxi) {
					maxi = mass[i][j];
					n = j;
				}
			}

			int temp = mass[i][0];
			mass[i][0] = mass[i][n];
			mass[i][n] = temp;

			// System.out.println(mass[i][0]);
			maxi = 0;
			n = 0;

		}

		System.out.println("max is first:");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

}
