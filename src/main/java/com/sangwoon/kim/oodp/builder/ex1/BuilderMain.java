package com.sangwoon.kim.oodp.builder.ex1;

public class BuilderMain {

    public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder()
                .dough("Thin Crust")
                .sauce("Tomato")
                .topping("Cheese")
                .build();

        System.out.println(myPizza);

        String oderType = "Veggie";

        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder().dough("Regular");

        pizzaBuilder.sauce("Pesto");

        if (oderType.equals("Veggie")) {
            pizzaBuilder.topping("Vegetables");
        } else {
            pizzaBuilder.topping("Pepperoni");
        }

        Pizza customPizza = pizzaBuilder.build();
        System.out.println(customPizza);

    }

}
