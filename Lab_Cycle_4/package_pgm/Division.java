package Arithmetic;

import java.util.*;

interface Div {
    float division(float a, float b);
}

public class Division implements Div {
    public float division(float a, float b) {
        return a/b;
    }
}
