package com.sangwoon.kim.oodp.specification.ex1;

public class SpecificationMain {

    public static void main(String[] args) {
        EvenSpecification evenSpec = new EvenSpecification();
        RangeSpecification rangeSpec = new RangeSpecification(10, 25);

        Specification evenAndInRangeSpec = evenSpec.and(rangeSpec);

        int number = 24;

        System.out.println("Even: " + evenSpec.isSatisfiedBy(number));

        System.out.println("In range 10-20: " + rangeSpec.isSatisfiedBy(number));

        System.out.println("Even and in range 10-20: " + evenAndInRangeSpec.isSatisfiedBy(number));
    }

}
