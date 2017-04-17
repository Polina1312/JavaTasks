package com.epam.polina_panarina.java.lesson2.task1.Salad;

import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Cucumber;
import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Radish;
import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Tomato;
import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Vegetables;

/**
 * Created by home on 16.04.2017.
 */
public class SpringSalad implements Salad {
    private String saladName;
    private Vegetables[] vegetables = new Vegetables[3];
    private double[] vegetablesQuantity = new double[vegetables.length];


    public double[] returnIngredientsQuantity() {
        return vegetablesQuantity;
    }

    public void returnIngredients() {
        setVegetables(this.vegetables);
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Ingredients: " + vegetables[i].getName());
        }
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = "Spring Salad";
    }

    public Vegetables[] getVegetables() {
        setVegetables(vegetables);
        return vegetables;
    }

    public void setVegetables(Vegetables[] vegetables) {
        this.vegetables[0] = new Tomato();
        this.vegetables[1] = new Radish();
        this.vegetables[2] = new Cucumber();
    }

    public double[] getVegetablesQuantity() {
        setVegetablesQuantity(vegetablesQuantity);
        return vegetablesQuantity;
    }

    public void setVegetablesQuantity(double[] vegetablesQuantity) {
        this.vegetablesQuantity[0] = 100;
        this.vegetablesQuantity[1] = 200;
        this.vegetablesQuantity[2] = 300;
    }

    @Override
    public void getSaladMaking() {
        ActionsWithSalad action = new ActionsWithSalad();
        System.out.println(getSaladName() + " Making");
        System.out.println("Let's use this vegetables: ");
        action.returnVegetables(this);
        System.out.println("Calorific value of the salad: " + action.calories(this));
        System.out.println("And calorific value of each vegetable in the salad is: ");
        action.returnCaloriesOfVegetablesInTheSalad(this);
        System.out.println("This salad is perfect for spring dinner");
    }


}
