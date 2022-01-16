package com.company.model;

public class Frog extends Animal{

    private String culoare;

    public Frog(String nume,double kg,int nrPicioare,String culoare) {
        super(nume, kg, nrPicioare, "amfibian");
        this.culoare=culoare;
    }
    public String descriereFrog(){
        String text=super.descriereAnimal();
        text+="culoare : " + culoare + "\n";
        return text;
    }
}
