package com.company.model;

public class Frog extends Animal{

    private String culoare;

    public Frog(String nume,double kg,int nrPicioare,String culoare) {
        super(nume, kg, nrPicioare, "amfibian");
        this.culoare=culoare;
    }
    public Frog(String line){
        super(line);
        this.culoare=line.split(",")[4];
    }

    public String getCuloare() {
        return culoare;
    }

    public String descriereFrog(){
        String text=super.descriereAnimal();
        text+="culoare : " + culoare + "\n";
        return text;
    }
    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + culoare;
        return text;
    }
}
