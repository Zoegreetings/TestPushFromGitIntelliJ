package org.example;

import org.example3.Fruit;

public class Main2 {
    public static void main(String[] args) {
        Pear pear = new Pear();
        System.out.println(pear.isHappy());
        Fruit f = new Fruit();
        System.out.println("this is something new 333333");
        System.out.printf("test push this is an fruit %s%n", f.isFruit());
    }
}