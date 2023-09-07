package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;

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
}
