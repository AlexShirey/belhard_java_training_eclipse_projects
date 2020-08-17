package Interface;

import java.util.Scanner;

public class Strings implements Arithmetic {
    private char[] mass;

    public void create() {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        mass = str.toCharArray();
    }

    public void show() {
        for (char s : mass) {
            System.out.print(s);
        }
        System.out.println();
    }

    public void showOne() {
        System.out.println("Введите номер выводимого значения");
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n > mass.length || n <= 0){
                    System.out.println("Число за пределами длины строки");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Это не число, введите число");
                sc = new Scanner(System.in);
            }
        }
        System.out.println("Искомое значение:" + mass[n-1]);
    }

    public void showOne(int n) {
        if (n > mass.length || n <= 0) {
            System.out.println("Число за пределами длины строки");
        } else {
            System.out.println("Искомое значение:" + mass[n - 1]);
        }
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (this.getClass()!= obj.getClass()){
            return false;
        }
        if (obj == null){
            return false;
        }
        Strings other = (Strings) obj;
        if (this.mass.length == other.mass.length){
            for (int i = 0; i < mass.length; i++){
                if (this.mass[i] != other.mass[i]){
                    return false;
                }
            }
        } else return false;
        return true;
    }

    public void summ(Object obj){
        Strings other = (Strings) obj;
        String s="";
        for (int i = 0; i < this.mass.length; i++){
            s += this.mass[i]+"";
        }
        for (int i = 0; i < other.mass.length; i++){
            s += other.mass[i]+"";
        }
        System.out.println(s);


    }


}