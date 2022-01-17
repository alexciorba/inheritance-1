package com.company.model;

public class Monkey extends Animal {

    private int degete;

    public Monkey(String nume,double kg,int nrPicioare,int degete){
        super(nume, kg, nrPicioare,"mamifer2");
        System.out.println("constructorul clasei Monkey");
        this.degete=degete;

    }
    public Monkey(String line){
        super(line);
        this.degete=Integer.parseInt(line.split(",")[4]);
    }
    public String descriereMonkey(){
        String text=super.descriereAnimal();
        text+="nr degete : " + degete + "\n";
        return text;
    }

    public int getDegete() {
        return degete;
    }

    public String toSave(){
        String text=super.toSave();
        text+="," + degete;
        return text;
    }
}
