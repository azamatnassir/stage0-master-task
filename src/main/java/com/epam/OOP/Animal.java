package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        return "This animal is mostly " +
                color + ". It has " + numberOfPaws + ((numberOfPaws == 1) ? " paw" : " paws") + " and " + ((hasFur) ? "a" : "no") + " fur.";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription()); //The results have the arguments we specified in their constructors and the Bird object has the additional sentence that we added by overriding the method 'getDescription'. Each time we create objects of these classes the result will be the same.
    }
}
