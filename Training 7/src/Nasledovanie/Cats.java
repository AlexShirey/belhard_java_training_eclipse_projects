package Nasledovanie;

import java.util.Scanner;

/**
 * Created by Shirey on 13.05.2016.
 */
public class Cats extends Animals{
    private static String className = "Cats";
    private String voice;

    public Cats(){

    }

    public Cats(String name, int age, int weight, String voice) {
        super(name, age, weight);
        this.voice = voice;
    }

    public void create(){
        super.create();
        System.out.println("Введите голос");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println("Вы ввели не голос");
            sc = new Scanner(System.in);
        }
        this.voice = sc.nextLine();
    }



    public void show(){
        super.show();
        StringBuffer sb = new StringBuffer();
        sb.append(voice).append(" voice ");
        System.out.print(sb);

    }

    public String getClassName(){
        return className;
    }

    public String getVoice(){
        return voice;
    }

    public void setVoice(String voice){
        this.voice = voice;
    }






}