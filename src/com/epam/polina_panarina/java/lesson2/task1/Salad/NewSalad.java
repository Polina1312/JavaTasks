package com.epam.polina_panarina.java.lesson2.task1.Salad;

import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Vegetables;

/**
 * Created by home on 17.04.2017.
 *
 * @author Polina Panarina
 * vegetablesQuantity array which stores weight of the vegetable in the salad (in grams)
 * vegetables array which stores Vegetable type objects (vegetables in the salad)
 * getSaladMaking method which describe salad creating and give information about the salad.
 */
public class NewSalad implements Salad {
    private String saladName;
    private Vegetables[] vegetables;
    private double[] vegetablesQuantity;


    public NewSalad(String saladName, Vegetables[] vegetables, double[] vegetablesQuantity) {
        this.saladName = saladName;
        this.vegetables = vegetables;
        this.vegetablesQuantity = vegetablesQuantity;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public double[] getVegetablesQuantity() {
        return vegetablesQuantity;
    }

    public void setVegetablesQuantity(double[] vegetablesQuantity) {
        this.vegetablesQuantity = vegetablesQuantity;
    }

    @Override
    public Vegetables[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables[] vegetables) {
        this.vegetables = vegetables;
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
        System.out.println("This is new salad");
    }


}
