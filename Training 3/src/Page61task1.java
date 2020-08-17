
public class Page61task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;

		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				n++;
			}
		}

		int[] mass = new int[n];
		int x = 2;

		for (int i = 0; i < mass.length; i++) {
			mass[i] = x;
			x = x + 2;
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}

	}

}
