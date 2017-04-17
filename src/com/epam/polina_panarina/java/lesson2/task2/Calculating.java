package com.epam.polina_panarina.java.lesson2.task2;

/**
 * Created by home on 17.04.2017.
 */
public class Calculating {

    protected int a;
    protected int b;
    protected String operator;

    /**
     * Constructor with parameters. Creates a Calculating of a given a, b
     *
     * @param a        enters by user
     * @param b        enters by user
     * @param operator enters by user and means operation of the computation
     */

    public Calculating(int a, String operator, int b) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int sum() {
        return getA() + getB();
    }

    public int multiply() {
        return getA() * getB();
    }

    /**
     * @divideChecking() method for divide checking. Here checks divide by zero
     */

    public boolean divideChecking() {
        boolean resultOfTheChecking;
        if (getB() == 0) {

            resultOfTheChecking = false;
        } else {
            resultOfTheChecking = true;
        }
        return resultOfTheChecking;
    }

    public double divide() {
        double divideResult = 0.00;
        if (divideChecking() == true) {
            divideResult = (double) getA() / (double) getB();
        }
        if (divideChecking() == false) {
            System.out.println("You can't divide by zero");
            divideResult = 0;
        }
        return divideResult;
    }

    public int minus() {
        return getA() - getB();
    }


    /**
     * @operatorDetermination() method for checking inputted symbol for computation and substituting needed operation for entered symbol.
     */
    public double operatorDetermination() {
        String sumType1 = "sum";
        String sumType2 = "+";
        String minusType1 = "minus";
        String minusType2 = "-";
        String multiplyType1 = "multiply";
        String multiplyType2 = "*";
        String divideType1 = "divide";
        String divideType2 = "/";
        double result = 0.00;
        if (minusType1.equals(getOperator()) || minusType2.equals(getOperator())) {
            result = minus();
        } else if (sumType1.equals(getOperator()) || sumType2.equals(getOperator())) {
            result = sum();
        } else if (multiplyType1.equals(getOperator()) || multiplyType2.equals(getOperator())) {
            result = multiply();
        } else if (divideType1.equals(getOperator()) || divideType2.equals(getOperator())) {
            result = divide();
        } else {
            System.out.println("Invalid type of operation. Check entered symbol/s");
            result = 0;
        }
        return result;
    }
}
