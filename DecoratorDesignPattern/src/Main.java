package org.example;

import org.example.DecoratorClass.ExtraCheese;
import org.example.DecoratorClass.ExtraMushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza veggieParadise = new VegieParadise();
        BasePizza farmhouse = new VegieParadise();
        System.out.println(new ExtraCheese(veggieParadise).cost());
        System.out.println(new ExtraMushroom(new ExtraCheese(farmhouse)).cost());
    }
}