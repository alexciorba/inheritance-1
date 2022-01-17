package com.company.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AnimalTest {

    @Test

    public void testConstructorAnimal(){
        Animal animal=new Animal("Azorel,2,4,mamifer1");
        assertEquals(animal.getNume(),"Azorel");
        assertEquals(animal.getNrPicioare(),4);
        assertEquals(animal.getKg(),2);
        assertEquals(animal.getTip(),"mamifer1");

        Dog dog=new Dog("rexi,3,4,tekel,mamifer1");
        assertEquals(dog.getNume(),"rexi");
        assertEquals(dog.getNrPicioare(),4);
        assertEquals(dog.getKg(),3);
        assertEquals(animal.getTip(),"mamifer1");

        Monkey monkey=new Monkey("loki,4,2,mamifer2,10");
        assertEquals(monkey.getNume(),"loki");
        assertEquals(monkey.getNrPicioare(),2);
        assertEquals(monkey.getKg(),4);
        assertEquals(monkey.getDegete(),10);
        assertEquals(monkey.getTip(),"mamifer2");

        Frog frog=new Frog("frog,0.2,2,amfibian,verde");
        assertEquals(frog.getNume(),"frog");
        assertEquals(frog.getNrPicioare(),2);
        assertEquals(frog.getKg(),0.2);
        assertEquals(frog.getCuloare(),"verde");
        assertEquals(frog.getTip(),"amfibian");


    }

}