package com.sangwoon.kim.oodp.decorator.ex1;

public class DecoratorMain {

    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(
                simpleCoffee.getDescription() + " $" + simpleCoffee.getCost()
        );

        MilkDecorator milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(
                milkCoffee.getDescription() + " $" + milkCoffee.getCost()
        );

        Coffee sugarDecorator = new SugarDecorator(milkCoffee);
        System.out.println(
                sugarDecorator.getDescription() + " $" + sugarDecorator.getCost()
        );

    }

}
