package com.epam.polina_panarina.java.lesson2.task1.Salad;

import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Vegetables;

/**
 * Created by home on 16.04.2017.
 *
 * @author Polina Panarina
 *         interface which describe salads classes "behavior"
 */
public interface Salad {

    String getSaladName();

    void setSaladName(String name);

    double[] getVegetablesQuantity();

    void setVegetablesQuantity(double[] ingredientsWeight);

    Vegetables[] getVegetables();

    void setVegetables(Vegetables[] vegetables);

    void getSaladMaking();


}
