
// с помощью цикла while и оператора if определяйте четность цифр и выводите
// их на экран (числа от 1 до 10)
// пример
// 1 - нечетное
// 2 - четное

public class Page48task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		while (n < 10) {
			n++;
			if (n % 2 == 0) {
				System.out.println(n + " - четное");
			} else {
				System.out.println(n + " - нечетное");
			}
		}

	}

}
