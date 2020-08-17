
public class Page61task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;

		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				n++;
			}
		}

		int[] mass = new int[n];
		int x = 1;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = x;
			x = x + 2;
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}

		System.out.println();

		for (int i = mass.length - 1; i >= 0; i--) {
			System.out.print(mass[i] + " ");
		}

	}

}
