package com.example.crapsgame;

/**
 * This class represent Arithmetic Operations
 * @author JUAN MANUEL CADENA
 * @version 1.0
 */
public class ArithmeticOperations {

    /**
     * The calculator name
     * @serialField
     */
    private String calculateName;

    /**
     * Calculate the sum of a and b
     * @param a operator 1
     * @param b operator 2
     * @return a + b
     */
    public int addition(int a, int b) {
        return a + b;
    }

    //@since se coloca al momento de nombrar la versión donde se realizó el cambio
    /**
     * Calculate the subtraction of a and b
     * @param a operator 1
     * @param b operator 2
     * @return a - b
     * @since 1.4
     */
    public int subtraction(int a, int b) {
        return a - b;
    }

    /**
     * Calculate the division the a and b
     * @param a dividend
     * @param b divisor
     * @throws ArithmeticException if divisor is zero
     * @return a / b
     */
    public int division(int a, int b) throws ArithmeticException {

        if (b == 0) {
            //Condición excepcional
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    /*
    Common method for performing a multiplication

    public int multiplication(int a, int b) {
        return a * b;
    }
    */

    //Another method for performing a multiplication

    /**
     * Calculate the multiplication of a per b
     * @param a multiplicator 1
     * @param b multiplicator 2
     * @return a * b
     * @see #addition(int a, int b)
     * @since 1.3
     */
    public int multiplication(int a, int b) {
        int acum = 0;
        for (int i = 0; i < b; i++) {
            acum = addition(acum,a);
        }
        return acum;
    }

}
