package Arithmetic;

import java.util.*;

interface Sub {
    float subtract(float a, float b);
}

public class Subtraction implements Sub {
    public float subtract(float a, float b) {
        return a-b;
    }
}
