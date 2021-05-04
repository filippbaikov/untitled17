package com.company;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        System.out.println(cat.name);
        cat.Swim(0);
        cat.Run(200);

        System.out.println();
        Dog dog = new Dog("Пёс");
        System.out.println(dog.name);
        dog.Swim(10);
        dog.Run(500);


    }
}