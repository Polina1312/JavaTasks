package com.epam.polina_panarina.java.lesson2.task1.Salad;

import com.epam.polina_panarina.java.lesson2.task1.Vegetables.*;

/**
 * Created by home on 16.04.2017.
 *
 * @author Polina Panarina
 */
public class SeaSalad implements Salad {
    private String saladName = "Sea Salad";
    private Vegetables[] vegetables = new Vegetables[5];
    private double[] vegetablesQuantity = new double[vegetables.length];

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public Vegetables[] getVegetables() {
        setVegetables(vegetables);
        return this.vegetables;
    }

    public void setVegetables(Vegetables[] vegetables) {
        this.vegetables[0] = new Peas();
        this.vegetables[1] = new Pepper();
        this.vegetables[2] = new Cucumber();
        this.vegetables[3] = new Carrot();
        this.vegetables[4] = new Cabbage();
    }

    public double[] getVegetablesQuantity() {
        setVegetablesQuantity(vegetablesQuantity);
        return this.vegetablesQuantity;
    }

    public void setVegetablesQuantity(double[] vegetablesQuantity) {
        this.vegetablesQuantity[0] = 100;
        this.vegetablesQuantity[1] = 150;
        this.vegetablesQuantity[2] = 300;
        this.vegetablesQuantity[3] = 200;
        this.vegetablesQuantity[4] = 150;
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
    }

}
