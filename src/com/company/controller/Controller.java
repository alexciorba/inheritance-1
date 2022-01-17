package com.company.controller;

import com.company.model.Animal;
import com.company.model.Dog;
import com.company.model.Frog;
import com.company.model.Monkey;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Animal>listaAnimale;

    public Controller(){
        listaAnimale=new ArrayList<>();
        load();
    }

    public void load(){

        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model1\\src\\com\\company\\source\\animale.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch (line.split(",")[3]){
                    case "mamifer1": this.listaAnimale.add(new Dog(line));
                    break;
                    case "amfibian" : this.listaAnimale.add(new Frog(line));
                    break;
                    case "mamifer2" : this.listaAnimale.add(new Monkey(line));
                    break;
                }
            }

        }catch (Exception e){

        }

    }

    public void addAnimal(Animal animal){
        listaAnimale.add(animal);
    }

    public String toSaveAnimal(){
        String text="";
        for(Animal animal :listaAnimale){
            text+=animal.toSave()+"\n";
        }
        return text;
    }
    public void saveAnimal(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\model1\\src\\com\\company\\source\\animale.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveAnimal());
            printWriter.close();
        }catch (Exception e){

        }
    }
    //todo:functie care returneaza cate broaste sunt
    public int amfibiene(){
        int cont=0;
        for(Animal animal: listaAnimale){
            if(animal instanceof Frog){
                cont++;
            }
        }
        return cont;
    }

}
