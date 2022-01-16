package com.company;

import com.company.model.Animal;
import com.company.model.Dog;
import com.company.model.Frog;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("azorel",5,4,"mamifer");
        System.out.println(animal.descriereAnimal());

        Dog dog=new Dog("Max",13,4,"pudel");
        System.out.println(dog.descriereDog());

        Frog frog=new Frog("kiki",0.2,2,"verde");
        System.out.println(frog.descriereFrog());
    }
}
