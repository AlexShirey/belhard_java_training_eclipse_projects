
import java.util.Scanner;

public class Task1 {
	String[] mass;
	String[] mass2;

	public String[] fillMass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число - кол-во строк в массиве");
		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число, введите число");
			sc.nextLine();
		}
		int n = sc.nextInt();
		String[] mas = new String[n];
		System.out.println("Введите строки");
		for (int i = 0; i < mas.length;) {
			Scanner sc2 = new Scanner(System.in);
			String s = sc2.nextLine();
			if (s.equals("end")) {
				for (int j = i; j < mas.length; j++) {
					mas[j] = Integer.toString(j);
				}
				break;
			}
			mas[i] = s;
			i++;
			System.out.println("ОК, осталось " + (n - i) + " cтрок");
		}
		return mas;
	}

	public void show(String[] mass) {
		for (String i : mass) {
			System.out.println(i);
		}
	}

	public void sort(String[] mass) {
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[j].length() < mass[i].length()) {
					String temp = mass[i];
					mass[i] = mass[j];
					mass[j] = temp;
				}
			}
		}
	}

	public void same(String[] mass) {
		int countSame = 0;
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[i].equals(mass[j])) {
					countSame++;
				}
			}
		}
		if (countSame > 0) {
			System.out.println("Есть одинаковые строки");
		} else {
			System.out.println("Нет одинаковых строк");
		}
	}

	public void last3ofLongest(String[] mass) {
		String max = mass[0];
		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i + 1].length() > mass[i].length()) {
				max = mass[i + 1];
			}
		}
		int x = max.length();
		System.out.println(max.subSequence(x - 3, x));
	}

	public void string2toUpperCase(String[] mass) {
		System.out.println(mass[1].toUpperCase());
	}

	public void delenieNaSlova(String[] mass) {
		String max = mass[0];
		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i + 1].length() > mass[i].length()) {
				max = mass[i + 1];
			}
		}
		String[] s = max.split("");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public void korotkaia2SimNum(String[] mass) {
		String min = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].length() < mass[0].length()) {
				min = mass[i];
			}
		}
		char ch = min.charAt(1);
		System.out.println(Character.isDigit(ch));

	}

}
