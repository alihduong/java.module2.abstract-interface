package com.thuchanh.Animal;

import com.thuchanh.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: chip-chip";
    }

    @Override
    public String howToEat() {
        return "Chicken eat Thoc";
    }
}
