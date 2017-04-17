package com.epam.polina_panarina.java.lesson2.task1.Salad;

import com.epam.polina_panarina.java.lesson2.task1.Vegetables.Vegetables;

import java.util.Scanner;

/**
 * Created by home on 17.04.2017.
 *
 * @author Panarina Polina
 *         This class which stores methods for making some computations by salads.
 * sortByCaloriesFromMinToMax method sorts array from vegetables in the salad by calories growth in general (calories in vegetable for 100g).
 * sortByCaloriesInSalad method sorts array from vegetables in the salad by calories growth (how much calories have every vegetable in the salad).
 * findVegetableByName method which search for entered vegetable and if it exists in the salad prints "Entered vegetable exists in the salad. "
 * if not "Entered vegetable doesn't exist in the salad. "
 * findVegetablesByCalories method which search for vegetables calories in the entered range
 * findVegetablesByCaloriesInTheSalad method which search for vegetables calories in the salad in the entered range
 */
public class ActionsWithSalad {
    private Vegetables[] vegetables;
    private double[] vegetablesQuantity;

    public double calories(Salad salad) {
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        double c = 0.0;
        for (int i = 0; i < vegetables.length; i++) {
            c += vegetables[i].getCalories() * (vegetablesQuantity[i] / vegetables[i].weight);
        }
        return c;
    }

    public void sortByCaloriesFromMinToMax(Salad salad) {
        Vegetables veg;
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        for (int j = 0; j < vegetables.length - 1; j++) {
            for (int i = 0; i < vegetables.length - 1; i++) {
                if (vegetables[i].getCalories() > vegetables[i + 1].getCalories()) {
                    veg = vegetables[i + 1];
                    vegetables[i + 1] = vegetables[i];
                    vegetables[i] = veg;
                }
            }
        }
        System.out.println("    Vegetables sorted by the calories growth: ");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable: " + vegetables[i].getName() + " calories: " + vegetables[i].getCalories());
        }
    }

    public void sortByCaloriesFromMaxToMin(Salad salad) {
        Vegetables veg;
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        for (int j = 0; j < vegetables.length - 1; j++) {
            for (int i = 0; i < vegetables.length - 1; i++) {
                if (vegetables[i].getCalories() < vegetables[i + 1].getCalories()) {
                    veg = vegetables[i + 1];
                    vegetables[i + 1] = vegetables[i];
                    vegetables[i] = veg;
                }
            }
        }
        System.out.println("    Vegetables sorted by the calories decreasing: ");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable: " + vegetables[i].getName() + " calories: " + vegetables[i].getCalories());
        }
    }

    public void returnCaloriesOfVegetablesInTheSalad(Salad salad) {
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        System.out.println("    " + "Information about vegetables in the salad:");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("    Vegetable in the salad: " + vegetables[i].getName() + "\n" + " calorific value of the vegetable" +
                    " in the salad: " + (vegetables[i].getCalories() * (vegetablesQuantity[i] / vegetables[i].weight)));
        }
    }


    public void sortByCaloriesInSalad(Salad salad) {
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        Vegetables veg;
        double caloriesInSalad = 0.0;
        double caloriesInSalad2 = 0.0;
        for (int j = 0; j < vegetables.length - 1; j++) {
            for (int i = 0; i < vegetables.length - 1; i++) {
                caloriesInSalad = vegetables[i].getCalories() * (vegetablesQuantity[i] / vegetables[i].weight);
                caloriesInSalad2 = vegetables[i + 1].getCalories() * (vegetablesQuantity[i + 1] / vegetables[i + 1].weight);
                if (caloriesInSalad > caloriesInSalad2) {
                    veg = vegetables[i + 1];
                    vegetables[i + 1] = vegetables[i];
                    vegetables[i] = veg;
                }
            }
        }
        System.out.println("    Vegetables sorted by the calories growth in the salad: ");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable: " + vegetables[i].getName() + " calories in the salad: " + vegetables[i].getCalories());
        }
        returnCaloriesOfVegetablesInTheSalad(salad);
    }

    public void sortByCostMinToMax(Salad salad) {
        Vegetables veg;
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        double vegetableCost = 0.0;
        double vegetableCost2 = 0.0;
        for (int j = 0; j < vegetables.length - 1; j++) {
            for (int i = 0; i < vegetables.length - 1; i++) {
                vegetableCost = vegetables[i].getCost() * (vegetablesQuantity[i] / vegetables[i].weight);
                vegetableCost2 = vegetables[i + 1].getCost() * (vegetablesQuantity[i + 1] / vegetables[i + 1].weight);
                if (vegetableCost > vegetableCost2) {
                    veg = vegetables[i + 1];
                    vegetables[i + 1] = vegetables[i];
                    vegetables[i] = veg;
                }
            }
        }
        System.out.println("    Vegetables sorted by cost from Min to Max");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable: " + vegetables[i].getName() + " cost in the salad: " + vegetables[i].getCost());
        }
    }

    public String returnSaladName(Salad salad) {
        vegetables = salad.getVegetables();
        String saladName = salad.getSaladName().toString();
        return saladName;
    }

    public void findVegetableByName(Salad salad) {
        String vegetableForSearch;
        String result = "";
        vegetables = salad.getVegetables();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("    " + "Vegetables Searching by Name");
            System.out.println("Enter vegetable name for search: ");
            vegetableForSearch = sc.next();
            for (int j = 0; j < vegetables.length; j++) {
                if (vegetableForSearch.contains(vegetables[j].getName())) {
                    result = "Entered vegetable exists in the salad. ";
                    break;
                } else {
                    result = "Entered vegetable doesn't exist in the salad. ";
                    continue;
                }
            }
            System.out.println("Result of search: " + result);
        }
        sc.close();

    }

    public void returnVegetablesAndCalories(Vegetables[] vegetables) {

        for (int k = 0; k < vegetables.length; k++) {
            System.out.println("Result of the calories search: " + "\n" + "Name: " + vegetables[k].getName() +
                    " Calories: " + vegetables[k].getCalories());
        }
    }

    public void findVegetablesByCalories(Salad salad) {
        double rangeOfCalories1;
        double rangeOfCalories2;

        int vegetablesInCaloriesRangeQuantity = 0;
        vegetables = salad.getVegetables();
        Scanner sc = new Scanner(System.in);
        System.out.println("    " + "Vegetables Searching by Calories");
        System.out.println("Enter needed range of calories in the salad: ");
        System.out.println("Enter the first border: ");
        rangeOfCalories1 = sc.nextDouble();
        System.out.println("Enter the second border: ");
        rangeOfCalories2 = sc.nextDouble();
        for (int i = 0; i < vegetables.length; i++) {
            if (rangeOfCalories1 <= vegetables[i].getCalories() && vegetables[i].getCalories() <= rangeOfCalories2) {
                vegetablesInCaloriesRangeQuantity = vegetablesInCaloriesRangeQuantity + 1;
            } else {
                vegetablesInCaloriesRangeQuantity = vegetablesInCaloriesRangeQuantity;
            }
        }

        Vegetables[] vegetablesInCaloriesRange = new Vegetables[vegetablesInCaloriesRangeQuantity];
        int iterator = 0;
        for (int i = 0; i < vegetablesInCaloriesRange.length; i++) {
            for (int j = iterator; j < vegetables.length; j++) {
                if (rangeOfCalories1 <= vegetables[j].getCalories() && vegetables[j].getCalories() <= rangeOfCalories2) {
                    vegetablesInCaloriesRange[i] = vegetables[j];
                    iterator = j + 1;
                    break;
                }

            }
        }
        returnVegetablesAndCalories(vegetablesInCaloriesRange);


    }


    public void findVegetablesByCaloriesInTheSalad(Salad salad) {
        double rangeOfCalories1;
        double rangeOfCalories2;
        double caloriesInSalad = 0.0;
        int vegetablesInCaloriesRangeQuantity = 0;
        vegetables = salad.getVegetables();
        vegetablesQuantity = salad.getVegetablesQuantity();
        Scanner sc = new Scanner(System.in);
        System.out.println("    " + "Vegetables Searching by Calories in the Salad");
        System.out.println("Enter needed range of calories in the salad: ");
        System.out.println("Enter the first border: ");
        rangeOfCalories1 = sc.nextDouble();
        System.out.println("Enter the second border: ");
        rangeOfCalories2 = sc.nextDouble();
        for (int i = 0; i < vegetables.length; i++) {
            caloriesInSalad = vegetables[i].getCalories() * (vegetablesQuantity[i] / vegetables[i].weight);

            if (rangeOfCalories1 <= caloriesInSalad && caloriesInSalad <= rangeOfCalories2) {
                vegetablesInCaloriesRangeQuantity = vegetablesInCaloriesRangeQuantity + 1;
            } else {
                vegetablesInCaloriesRangeQuantity = vegetablesInCaloriesRangeQuantity;
            }
        }


        Vegetables[] vegetablesInCaloriesRange = new Vegetables[vegetablesInCaloriesRangeQuantity];
        if (vegetablesInCaloriesRange.length == 0) {
            System.out.println("There are no vegetables with such calories values in the salad");
        }
        int iterator = 0;
        for (int i = 0; i < vegetablesInCaloriesRange.length; i++) {

            for (int j = iterator; j < vegetables.length; j++) {
                caloriesInSalad = vegetables[j].getCalories() * (vegetablesQuantity[j] / vegetables[j].weight);
                if (rangeOfCalories1 <= caloriesInSalad && caloriesInSalad <= rangeOfCalories2) {
                    vegetablesInCaloriesRange[i] = vegetables[j];
                    iterator = j + 1;
                    System.out.println("Result of the calories search: " + "\n" + "Name: " + vegetablesInCaloriesRange[i].getName() +
                            " Calories: " + caloriesInSalad);
                    break;

                }

            }

        }


    }

    public void returnVegetables(Salad salad) {
        vegetables = salad.getVegetables();
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println("Vegetable in the salad: " + vegetables[i].getName());
        }
    }


}
