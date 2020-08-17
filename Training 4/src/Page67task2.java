/*
 * Создать двухмерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка
 * [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента
 * этого массива
 */
public class Page67task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[5][8];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 199 - 99);
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		int max = mass[0][0];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > max) {
					max = mass[i][j];
				}

			}

		}
		
		 System.out.println(max);
	}
}
