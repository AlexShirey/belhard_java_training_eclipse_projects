package Interface;

import java.util.Scanner;

public class Vectors implements Arithmetic{
    private int[] mass;

    public void create(){
        System.out.println("Введите кол-во элементов вектора");
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            } else {
                System.out.println("это не число, введите число");
                sc = new Scanner(System.in);
            }
        }
        mass = new int[n];
        System.out.println("Введите числа - элементы вектора");
        int i = 0;
        while (i < n) {
            if (sc.hasNextInt()) {
                mass[i] = sc.nextInt();
                i++;
            } else {
                System.out.println("это не число, введите число");
                sc = new Scanner(System.in);
            }
        }
    }

    public void show (){
        for (int s : mass){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public boolean SravnenieDlin(Vectors name){
        if (this.mass.length == name.mass.length){
            return true;
        } else {
            return false;
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
        Vectors other = (Vectors) obj;
        if (this.mass.length == other.mass.length) {
            for (int i = 0; i < this.mass.length; i++) {
                if (this.mass[i] != other.mass[i]) {
                    return false;
                }
            }
        } else return false;
        return true;
    }

    public void summ(Object obj){
        Vectors other = (Vectors) obj;
        Vectors summa = new Vectors();
        summa.mass = new int[Math.max(this.mass.length, other.mass.length)];
        for (int i = 0; i < this.mass.length; i++) {
            summa.mass[i] = this.mass[i];
        }
        for (int i = 0; i < other.mass.length; i++) {
            summa.mass[i] += other.mass[i];
        }

        summa.show();

    }

}