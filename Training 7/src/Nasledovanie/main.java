package Nasledovanie;

/**
 * Created by Shirey on 13.05.2016.
 */
public class main {
    public static void main(String[] args){

        Animals[] mass = Animals.fillMass();
        for (int i = 0; i < mass.length; i++){
            mass[i].show();
            System.out.println("");

        }
    }
}


/*
        Animals an = new Animals();
        an.create();
        an.show();
        System.out.println("");

        Cats cat1 = new Cats("Kotik", 5, 5, "mia-mia");
        cat1.create();
        cat1.show();
        System.out.println("");

        Dogs dog1 = new Dogs("Misha", 6, 6, "сильный");
        dog1.create();
        dog1.show();
        System.out.println("");

        Kitties kitty1 = new Kitties("Котенок", 3, 4, "miu-miu", "white");
        kitty1.create();
        kitty1.show();
        System.out.println("");
*/