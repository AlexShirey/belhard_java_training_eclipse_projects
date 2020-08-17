package Nasledovanie;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by Shirey on 13.05.2016.
 */
public class Animals {
    private static String className = "Animals";
    private String name;
    private int age;
    private int weight;

    public Animals(){

    }

    public Animals(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static Animals[] fillMass(){
        System.out.println("Введите желаемое кол-во создаваемых объектов");
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Вы ввели не число, введите число");
            sc.nextLine();
        }
        Animals[] mass = new Animals[sc.nextInt()];
        for (int i = 0; i < mass.length; ){
            System.out.println("Какое животное создать? (1 - класс Animals, 2 - класс Cats, 3 - класс Dogs, 4 - класс Kitties");
            while(!sc.hasNextInt()){
                System.out.println("Вы ввели не число, введите число (1-4)");
                sc = new Scanner(System.in);
            }
            int n = sc.nextInt();
            switch(n) {
                case 1:
                    mass[i] = new Animals();
                    mass[i].create();
                    i++;
                    break;
                case 2:
                    mass[i] = new Cats();
                    mass[i].create();
                    i++;
                    break;
                case 3:
                    mass[i] = new Dogs();
                    mass[i].create();
                    i++;
                    break;
                case 4:
                    mass[i] = new Kitties();
                    mass[i].create();
                    i++;
                    break;
                default:
                    System.out.println("что-то не то, попробуйте еще раз");
            }
        }
        return mass;
    }

    public void create(){
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println("Вы ввели не имя, введите имя");
            sc = new Scanner(System.in);
        }
        this.name = sc.nextLine();

        System.out.println("Введите возраст ");
        while(!sc.hasNextInt()){
            System.out.println("Вы ввели не возраст, введите число");
            sc.nextLine();
        }
        this.age = sc.nextInt();

        System.out.println("Введите вес ");
        while(!sc.hasNextInt()){
            System.out.println("Вы ввели не вес, введите число");
            sc = new Scanner(System.in);
        }
        this.weight = sc.nextInt();
    }

    public void show(){
        StringBuffer sb = new StringBuffer();
        sb.append(" class ").append(name).append(" name ").append(age).append(" age ").append(weight).append(" weight ");
        System.out.print(getClassName() + sb);
    }

    public String getClassName(){
        return className;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}