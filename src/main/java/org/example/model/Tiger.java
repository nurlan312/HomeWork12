package org.example.model;

public class Tiger implements Animal {

    private String color;
    private int age;
    private int weight;

    @Override
    public void animalPlus() {
        System.out.println("Тигр очень сильный и храбрый животный.");
    }

    @Override
    public void animalMinus() {
        System.out.println("Тигр может съест человека, и не только человека )");
    }

    public Tiger() {
    }

    public Tiger(String color, int age, int weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Любимый животный: {Tiger: " +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
