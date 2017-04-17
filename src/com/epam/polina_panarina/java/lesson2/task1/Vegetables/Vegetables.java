package com.epam.polina_panarina.java.lesson2.task1.Vegetables;

/**
 * Created by home on 16.04.2017.
 *
 * @author Panarina Polina
 *         Superclass for all vegetables. Include set and get methods, constructor and method for information print
 */
public class Vegetables {

    public double weight = 100;
    String typeOfIngredient = "vegetable";
    private String nameOfVegetable;
    private double calories;
    private double cost;

    /**
     * Constructor with parameters.
     */
    public Vegetables(String nameOfVegetable, double calories, double cost) {
        this.nameOfVegetable = nameOfVegetable;
        this.calories = calories;
        this.cost = cost;
    }

    public String getName() {
        return nameOfVegetable;
    }

    public void setVegetableName(String vegetableName) {
        vegetableName = nameOfVegetable;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        if (calories >= 0) {
            this.calories = calories;
        } else if (calories < 0) {
            System.out.println("Vegetables can't have calories < 0");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else if (cost < 0) {
            System.out.println("Vegetables can't have cost < 0");
        }
    }

    public void printInfo() {
        System.out.println("The vegetable name is: " + getName() + "\n" + "The vegetable calories value: " + getCalories() + " cal per 100 g." +
                "\n" + "The vegetable cost: " + getCost() + " for 100 g.");
    }
}


