/*
 *  Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9...
 */
public class Page71task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int count = 0;
		while (true) {
			System.out.println(i);
			i = i + 2;
			count++;
			if (count == 55) {
				break;
			}

		}

	}

}
