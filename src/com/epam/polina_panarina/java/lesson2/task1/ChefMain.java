package com.epam.polina_panarina.java.lesson2.task1;

import com.epam.polina_panarina.java.lesson2.task1.Salad.ActionsWithSalad;
import com.epam.polina_panarina.java.lesson2.task1.Salad.NewSalad;
import com.epam.polina_panarina.java.lesson2.task1.Salad.SeaSalad;
import com.epam.polina_panarina.java.lesson2.task1.Vegetables.*;

/**
 * Created by home on 16.04.2017.
 *
 * @author Polina Panarina
 *         main class which runs the program
 */
public class ChefMain {

    public static void main(String[] args) {

        Tomato tomato = new Tomato();
        System.out.println(tomato.getName());
        tomato.printInfo();

        Vegetables beet = new Vegetables("beet", 48, 5);
        beet.printInfo();

        SeaSalad sea = new SeaSalad();
        ActionsWithSalad act = new ActionsWithSalad();
        System.out.println("Salad name " + sea.getSaladName());
        //sea.getSaladMaking();
        act.returnCaloriesOfVegetablesInTheSalad(sea);
        act.findVegetablesByCaloriesInTheSalad(sea);

        Vegetables[] vegetablesForNewSalad = new Vegetables[4];
        vegetablesForNewSalad[0] = new Potato();
        vegetablesForNewSalad[1] = new Carrot();
        vegetablesForNewSalad[2] = new Pepper();
        vegetablesForNewSalad[3] = new Peas();
        double[] vegetablesQuantity = new double[vegetablesForNewSalad.length];
        vegetablesQuantity[0] = 70;
        vegetablesQuantity[1] = 170;
        vegetablesQuantity[2] = 350;
        vegetablesQuantity[3] = 100;
        NewSalad newSalad = new NewSalad("Mexican fun", vegetablesForNewSalad, vegetablesQuantity);
        System.out.println("New salad: ");
        System.out.println(newSalad.getSaladName());
        act.calories(newSalad);
        act.returnCaloriesOfVegetablesInTheSalad(newSalad);
        act.findVegetablesByCaloriesInTheSalad(newSalad);
    }
}
