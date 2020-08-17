
public class Page61task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mass = new int[15];
		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 10);
			System.out.print(mass[i] + " ");
			if (mass[i] % 2 == 0 && mass[i] != 0) {
				count++;
			}

		}

		System.out.println();
		System.out.println("count = " + count);

	}

}
