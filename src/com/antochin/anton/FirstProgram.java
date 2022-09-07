package com.antochin.anton;

public class FirstProgram {

    public static void main(String[] args) {
        Pig hruk = new Pig("hruk", 56);
        Pig lolka = new Pig("lolka", 70);
        Pig natasha = new Pig("natasha", 87);
        Pig gala = new Pig("gala", 21);
        Pig nastya = new Pig("nastya", 33);

        System.out.println(hruk.getName() + ": " + hruk.getWeight() +" kg");
        System.out.println(lolka.getName() + ": " + lolka.getWeight() +" kg");
        System.out.println(natasha.getName() +" :" + natasha.getWeight() +"kg ");
        System.out.println(gala.getName() +" :" + gala.getWeight() + "kg");
        System.out.println(nastya.getName() + " :" + nastya.getWeight() + "kg");

        int weight = hruk.getWeight() + lolka.getWeight() + natasha.getWeight() + gala.getWeight() + nastya.getWeight();
        System.out.println("counting : " + weight);
    }
}
