

public class Page146Task1 {
	public static void main(String[] argrs) {

		Task1 text1 = new Task1();

		text1.mass = text1.fillMass();
		// text1.mass2 = text1.fillMass();

		System.out.println(" ");
		System.out.println("Оригинальный массив");
		text1.show(text1.mass);
		// text1.show(text1.mass2);

		text1.sort(text1.mass);
		System.out.println(" ");
		System.out.println("Отсортированный массив по длине");
		text1.show(text1.mass);

		System.out.println(" ");
		System.out.print("Проверка на одинаковые строки: ");
		text1.same(text1.mass);

		System.out.println(" ");
		System.out.print("Последние три элемента самой длинной строки: ");
		text1.last3ofLongest(text1.mass);

		System.out.println(" ");
		System.out.print("Вторая строка в верхнем регистре: ");
		text1.string2toUpperCase(text1.mass);

		System.out.println(" ");
		System.out.print("Самая длинная строка, разбитая на слова: ");
		text1.delenieNaSlova(text1.mass);

		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Второй символ самой короткой строки цифра: ");
		text1.korotkaia2SimNum(text1.mass);

	}
}
