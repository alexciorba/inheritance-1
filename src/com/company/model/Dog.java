package com.company.model;

public class Dog extends Animal{

    private String rasa;

    public Dog(String nume,double kg,int nrPicioare,String rasa){
        super(nume,kg,nrPicioare,"mamifer1");
        this.rasa=rasa;
    }
    public Dog(String line){
        super(line);
        this.rasa=line.split(",")[4];
    }


    public String descriereDog(){
        String text=super.descriereAnimal();
        text+="rasa : " + rasa + "\n";
        return text;
    }
    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + rasa;
        return text;
    }

}
