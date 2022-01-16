package com.company.model;

public class Dog extends Animal{

    private String rasa;

    public Dog(String nume,double kg,int nrPicioare,String rasa){
        super(nume,kg,nrPicioare,"mamifer");
        this.rasa=rasa;
    }


    public String descriereDog(){
        String text=super.descriereAnimal();
        text+="rasa : " + rasa + "\n";
        return text;
    }

}
