/*
 * Вычислить сумму и число положительных элементов матрицы A[N, N], находящихся над главной диагональю;
 */
public class Page74task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[5][5]; // N = 5;

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 11 - 5); // [-5;5]
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		int summ = 0;
		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			for (int j = i + 1; j < mass[i].length; j++) {
				if (mass[i][j] > 0) {
					summ = summ + mass[i][j];
					count++;

				}
			}

			System.out.println("summ = " + summ + "; count = " + count);

		}

		System.out.println("total summ = " + summ + "; total count =" + count);

	}

}
