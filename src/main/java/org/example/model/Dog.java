package org.example.model;

public class Dog implements Animal {

    private String name_dog;
    private String breed;
    private String color;
    private int age_dog;
    private int weight;

    @Override
    public void animalPlus() {
        System.out.println(name_dog + " - самый преданный и бескорыстный товарищ.");
    }

    @Override
    public void animalMinus() {
        System.out.println(name_dog + " - иногда не очень добрый )");
    }

    public Dog() {
    }

    public Dog(String name_dog, String breed, String color, int age_dog, int weight) {
        this.name_dog = name_dog;
        this.breed = breed;
        this.color = color;
        this.age_dog = age_dog;
        this.weight = weight;
    }

    public String getName_dog() {
        return name_dog;
    }

    public void setName_dog(String name_dog) {
        this.name_dog = name_dog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge_dog() {
        return age_dog;
    }

    public void setAge_dog(int age_dog) {
        this.age_dog = age_dog;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Любимый животный: {Dog: " +
                "name='" + name_dog + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age_dog +
                ", weight=" + weight +
                '}';
    }


}
