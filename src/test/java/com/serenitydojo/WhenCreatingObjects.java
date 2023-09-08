package com.serenitydojo;

import com.serenitydojo.checks.DogClassTest;
import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    //Exercise: Write your first Java Class
    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido", "Bone", 5);
        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());

    //Additional exercise for Chappy dog
        Dog chappy = new Dog("Chappy", "Slippers", 1);
        System.out.println(chappy.getName());
        System.out.println(chappy.getFavoriteToy());
        System.out.println(chappy.getAge());

    }

    @Test
    public void creating_a_dog_test() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    //Additional exercise for Chappy dog
    @Test
    public void creating_a_dog_additional_test() {
        Dog chappy = new Dog("Chappy", "Slippers", 1);
        Assert.assertEquals(chappy.getName(), "Chappy");
        Assert.assertEquals(chappy.getFavoriteToy(), "Slippers");
        Assert.assertEquals(chappy.getAge(), 1);
    }
    //Exercise: Fields and methods
    @Test
    public void dog_makes_some_noise() {
        Dog fido = new Dog("Fido", "Bone", 5);

        fido.makeNoise(Dog.DOG_NOISE);
        fido.feed(true);
    }

}

/*
In this exercise, you will add some methods to the Dog class you created previously.
To ensure they work, complete the new tests in the WhenCreatingObjects class:

Add a method called makeNoise() to your Dog class that returns "Woof"
Add a new method called feed() method that sets the isFed field to true
Refactor your makeNoise() method to use a static constant called DOG_NOISE
 */