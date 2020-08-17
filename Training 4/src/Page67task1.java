/*
 * создать двухмерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка
 * [10;99]. Вывести массив еа экран
 */

public class Page67task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[8][5];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 90 + 10);
			}

		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println("");

		}

	}

}
