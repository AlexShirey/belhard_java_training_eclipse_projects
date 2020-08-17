/*
 * Нужно создать нерегулярный массив, подобный table..
 * 1. Количество строк вводится, а количество элементов в каждой строке задается случайным образом
 * в диапазоне от 1 до 10
 * 2. Заполнить его какими-нибудь элементами
 * 3. Вывести массив красиво  
 * 4. Необходимо переставить строки массива, чтобы их размер возрастал
 */
public class Page69task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[4][];

		for (int i = 0; i < mass.length; i++) {
			int n = (int) (Math.random() * 7 + 1);
			mass[i] = new int[n];

		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10 + 1);

			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		// Необходимо переставить строки массива, чтобы их размер возрастал

		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[i].length > mass[j].length) {
					int[] max = mass[i];
					mass[i] = mass[j];
					mass[j] = max;
				}
			}
		}

		System.out.println("sorted");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

}
