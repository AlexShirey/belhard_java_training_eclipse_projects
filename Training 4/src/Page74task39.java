/**
 * Задана матрица размером  n x t. Найти максимальный по модулю элемент матрицы.
 * Переставить строки и столбцы матрицы таким образом, чтобы максимальный по модулю элемент был расположен на пересечении
 * к-ой строки и к-ого столбца
 */
public class Page74task39 {
    public static void main(String[] args){

        int[][] mass = new int[5][6];

        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                mass[i][j] = (int)(Math.random()*10);  //[0,9]
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int max = Math.abs(mass[0][0]);
        int n = 0;
        int m = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (Math.abs(mass[i][j]) > max){
                    max = Math.abs(mass[i][j]);
                    n = i; // строка
                    m = j; // столбец
                }
            }
        }

        System.out.println("max = " + max);
        System.out.println("строка с max = " + n);
        System.out.println("столбец с max = " + m);

        int k = 3; //задаем где будет пересечение

        // переставляем строки
        int[] temp = mass[k];
        mass[k] = mass[n];
        mass[n] = temp;

        System.out.println("sorted строки");

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        // переставляем столбцы
        for (int i = 0; i < mass.length; i++) {
            int temp1 = mass[i][k];
            mass[i][k] = mass[i][m];
            mass[i][m] = temp1;
            }

        System.out.println("sorted столбцы");

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
