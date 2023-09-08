package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
   private boolean isFed;
    public static final String DOG_NOISE = "'Woof'";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getFavoriteToy() {
        return this.favoriteToy;
    }

    public int getAge() {
        return this.age;
    }

    public void makeNoise(String noise) {
        System.out.println(name + " makes noise: " + noise);
    }

    public void feed(boolean isAnimalFed) {
        System.out.println("Is "+ name + " fed?: " + isAnimalFed);
    }

}
