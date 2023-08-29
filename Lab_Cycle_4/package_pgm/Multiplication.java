package Arithmetic;

import java.util.*;

interface Mul {
    float multiply(float a, float b);
}

public class Multiplication implements Mul {
    public float multiply(float a, float b) {
        return a*b;
    }
}
