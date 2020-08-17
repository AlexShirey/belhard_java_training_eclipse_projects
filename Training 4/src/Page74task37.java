/*
 * Дана матрица B[N, M]. Найти в каждой строке матрицы максимальный и минимальный элементы и 
 * поменять их местами с первым и последним элементом строки соответственно;
 */
public class Page74task37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mass = new int[5][6];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 11); // [-5,5];
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < mass.length; i++) {
			int max = mass[i][0];
			int nmax = 0;
			for (int j = 0; j < mass[i].length; j++) {

				if (mass[i][j] > max) {
					max = mass[i][j];
					nmax = j;
				}

			}

			int temp = mass[i][0];
			mass[i][0] = mass[i][nmax];
			mass[i][nmax] = temp;

		}

		for (int i = 0; i < mass.length; i++) {
			int min = mass[i][0];
			int nmin = 0;
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] < min) {
					min = mass[i][j];
					nmin = j;
				}
			}

			int temp1 = mass[i][mass[i].length - 1];
			mass[i][mass[i].length - 1] = mass[i][nmin];
			mass[i][nmin] = temp1;
		}

		System.out.println("sorted max & min");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

}
