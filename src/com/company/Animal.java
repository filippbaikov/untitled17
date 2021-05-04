package com.company;

public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void Swim(int swim){

        System.out.println("плывет "+ swim);
    }
    public void animalInfo(){
        getName();
    }
    public void Run(int run){
        System.out.println("бежит "+ run);
    }
}