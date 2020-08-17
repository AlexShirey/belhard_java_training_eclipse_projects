
public class Page146Task2 {

	public static void main(String[] args) {

		int N = 6;
		String[] mass = new String[N];
		mass[0] = "hello world hello , world! hello";
		mass[1] = "im 32 years old";
		mass[2] = "my name name is Alex, and surname - Shirey";
		mass[3] = "Hm.. dont know wh3at to type. Can u help? some numb4ers 34, 33, 5";
		mass[4] = "I think.. name (that is) hello enougth.";
		mass[5] = "and some numbers - 5, 6, 25, 49";

		// 2) выводим значения длин всех строк массива;
		System.out.println("выводим значения длин всех строк массива");
		for (int i = 0; i < mass.length; i++) {
			System.out.println("Длина " + i + " строки = " + mass[i].length());
		}

		// 3) выводим строки с i по j из массива;
		int j = 4;
		System.out.println("");
		System.out.println("выводим строки с i по j из массива, i = 2, j = 4");
		for (int i = 2; i <= j; i++) {
			System.out.println(mass[i]);
		}

		// 4) выводим номер строки с максимальной цифрой;
		System.out.println("");
		System.out.println("выводим номер строки с максимальной цифрой");
		int max = Integer.MIN_VALUE;
		int stringNumber = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int n = 0; n < mass[i].length(); n++) {
				if (Character.isDigit(mass[i].charAt(n)) == true) {
					int x = Character.getNumericValue(mass[i].charAt(n));
					if (x > max) {
						max = x;
						stringNumber = i;
					}
				}
			}
		}
		System.out.println("номер строки с максимальной цифрой = " + stringNumber);

		// 5) удаляем из i-ой строки все заглавные буквы;
		System.out.println("");
		System.out.println("i-ая строка с удаленными заглавными буквами: (i = 3)");
		char[] ch = mass[3].toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i]) == true) {
				ch[i] = ' ';
			}
			System.out.print(ch[i]);
		}

		// 6) удаляем из i-ой строки все символы не буквы и не цифры;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("i-ая строка с удаленными сиволами: (i = 4)");
		char[] ch1 = mass[4].toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (Character.isLetterOrDigit(ch1[i]) == false) {
				ch1[i] = ' ';
			}
			System.out.print(ch1[i]);
		}

		// 7) выводим из i-ой строки все слова, содержащие только цифры;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("слова, содержащие только цифры в i-ой строке: (i = 3)");
		String[] worlds = mass[3].split(",");
		mass[3] = "";
		for (int i = 0; i < worlds.length; i++) {
			mass[3] = mass[3] + worlds[i];
		}
		worlds = mass[3].split(" ");
		for (int i = 0; i < worlds.length; i++) {
			for (int n = 0; n < worlds[i].length(); n++) {
				if (Character.isDigit(worlds[i].charAt(n)) == true) {
					System.out.print(worlds[i] + " ");
				}
			}
		}

		// 8) вычисляет сумму всех цифр i-ой строки;
		System.out.println(" ");
		System.out.println(" ");
		int summ = 0;
		System.out.println("сумма всех цифр i-ой строки: (i = 3)");
		for (int i = 0; i < mass[3].length(); i++) {
			if (Character.isDigit(mass[3].charAt(i))) {
				summ += Character.getNumericValue(mass[3].charAt(i));
			}
		}
		System.out.println(summ);

		// 9) выводим из массива все слова, содержащие только прописные буквы;
		System.out.println(" ");
		System.out.println("слова массива, содержащие только прописные буквы");
		for (int i = 0; i < mass.length; i++) {
			String[] worlds1 = mass[i].split(" ");
			for (int k = 0; k < worlds1.length; k++) {
				for (int n = 0; n < worlds1[k].length();) {
					if (Character.isLowerCase(worlds1[k].charAt(n)) == true) {
						n++;
					} else {
						break;
					}
					if (n == worlds1[k].length()) {
						System.out.print(worlds1[k] + " ");
					}
				}
			}
		}

		// 10) выводим все числа из строк;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("выводим все числа из строк");
		for (int i = 0; i < mass.length; i++) {
			for (int n = 0; n < mass[i].length(); n++) {
				if (Character.isDigit(mass[i].charAt(n)) == true) {
					System.out.print(mass[i].charAt(n) + " ");
				}
			}
			System.out.println("");
		}

		// 11) удаляем из строки часть, заключенную между двумя символами ( )
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("удаляем из i-ой строки часть, заключенную между двумя символами ( ), i = 4");
		int x1 = mass[4].indexOf('(');
		int x2 = mass[4].indexOf(')');
		StringBuffer strBuff = new StringBuffer(mass[4]);
		System.out.println(strBuff.delete(x1, x2 + 1));
		// String str = mass[4].substring(0, mass[4].indexOf('('));
		// String str1 = mass[4].substring(mass[4].indexOf(')') + 1,
		// mass[4].length());
		// System.out.print(str + str1);

		// 12) определяем, сколько в массиве одинаковых строк
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("одинаковых строк в массиве:");
		int count = 0;
		for (int i = 0; i < mass.length - 1; i++) {
			for (int n = i + 1; n < mass.length; n++)
				if (mass[i].equals(mass[n])) {
					count++;
				}
		}
		System.out.println(count);

		// 13) Определяем, сколько в массиве одинаковых слов
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("одинаковые слова и кол-во их повторений:");
		int count2 = 0;
		String str2 = "";
		for (int i = 0; i < mass.length; i++) {
			str2 = str2 + mass[i] + " ";
		}
		String[] worlds2 = str2.split(" ");
		for (int n = 0; n < worlds2.length - 1; n++) {
			for (int k = n + 1; k < worlds2.length; k++) {
				if (worlds2[n].equals(worlds2[k])) {
					count2++;
					worlds2[k] = " ";
				}
			}

			if (count2 > 0 && Character.isLetterOrDigit(worlds2[n].charAt(0)) == true) {
				System.out.println("Слово " + worlds2[n] + ", кол-во повторений = " + count2);
			}
			count2 = 0;
		}

		// 14) объединяем в одну строку строки с i по j

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("объединяем в одну строку строки с 2 по 4");
		String resultStr = "";
		for (int i = 2; i <= 4; i++) {
			resultStr += mass[i] + " ";
		}
		System.out.println(resultStr);

		// 15) преобразовываем i-ю строку так, чтобы все слова начинались с
		// заглавной буквы
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("все слова i-ой строки начинаются с заглавной буквы (i = 1)");
		String result5 = "";
		String[] worlds3 = mass[1].split(" ");
		for (int i = 0; i < worlds3.length; i++) {
			char[] ch5 = worlds3[i].toCharArray();
			worlds3[i] = "";
			char temp = Character.toUpperCase(ch5[0]);
			ch5[0] = temp;
			for (int n = 0; n < ch5.length; n++) {
				worlds3[i] += ch5[n];
			}
			result5 += worlds3[i] + " ";

		}
		System.out.println(result5);

		// 16 вносим изменения в i-ю строку (передается новое содержание)
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("i-я строка с новым содержанием (i = 1, содержание - \"fldfd\")");
		String change = "fldfd";
		for (int i = 0; i < mass.length; i++) {
			if (i == 1) {
				mass[i] = change;
			}
		}
		for (String s : mass) {
			System.out.println(s);
		}

	}
}
