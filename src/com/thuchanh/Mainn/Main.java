package com.thuchanh.Mainn;

import com.thuchanh.Animal.Animal;
import com.thuchanh.Animal.Chicken;
import com.thuchanh.Animal.Tiger;
import com.thuchanh.Edible.Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

    }
}
