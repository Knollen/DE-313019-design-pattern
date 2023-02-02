package de.brightslearning.java.advanced.designpattern.strategy;

public class Animal {

    private String name;
    private double height;
    private int weight;

    private String sound;

    public Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
