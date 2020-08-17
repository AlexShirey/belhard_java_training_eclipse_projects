/*
 * напишите цикл while выводящий числа последовательности 1, 4, 7, 10... до тех пор, пока их произведение не превысит 300 или сумма 200.
 * выведите количество этих чисел
 */
public class Page48task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		int x = 1;
		int summ = 0;
		int ncount = 0;

		while (true) {
			x = x * n;
			summ = summ + n;

			if (x < 300 && summ < 200) {
				ncount++;
				System.out.println(n);
				n = n + 3;
			} else {
				System.out.println("количество чисел равно " + ncount);
				break;
			}

		}

	}

}
