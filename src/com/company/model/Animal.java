package com.company.model;

public class Animal {

    private String nume;
    private double kg;
    private int nrPicioare;
    private String tip;


    public Animal(String nume,double kg,int nrPicioare,String tip){
        System.out.println("Constructorul de initializare din superclasa");
        this.nume=nume;
        this.kg=kg;
        this.nrPicioare=nrPicioare;
        this.tip=tip;
    }


    public Animal(String text){
       this(text.split(",")[0],
               Double.parseDouble(text.split(",")[1]),
               Integer.parseInt(text.split(",")[2]),
               text.split(",")[3]);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return this.nume;
    }

    public double getKg() {
        return this.kg;
    }

    public int getNrPicioare() {
        return this.nrPicioare;
    }

    public String getTip() {
        return this.tip;
    }

    public String descriereAnimal(){
        String text="";
        text+="nume : " + nume + "\n";
        text+="kg : " + kg + "\n";
        text+="nr picioare : " + nrPicioare + "\n";
        text+="tipul :" + tip + "\n";
        return text;
    }

    public String toSave(){
        String text="";
        text+=nume + "," + kg + "," + nrPicioare + "," + tip;
        return text;
    }
}
