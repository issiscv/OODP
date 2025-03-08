package com.sangwoon.kim.oodp.prototype.ex1;

public class PrototypeMain {

    public static void main(String[] args) {
        Person original = new Person("John", 30, "123 Main st");
        original.displayInfo();

        Person cloned = original.clone();
        cloned.setAddress("456 Clone St");

        System.out.println("\nAfter cloning and modifying the clone:");

        original.displayInfo();
        cloned.displayInfo();

    }

}
