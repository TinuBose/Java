package Arithmetic;

import java.util.*;

interface Div {
    void divide(float a, float b);
}

public class Division implements Div {
    public void divide(float a, float b) {
        System.out.println("The quotient of two numbers is:" + (a / b));
    }
}