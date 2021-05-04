package com.company;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);

    }

    @Override
    public void Swim(int swim) {
        if (swim==0)
            System.out.println("не плавает");
    }
}


