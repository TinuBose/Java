package Arithmetic;

import java.util.*;

interface Add {
    float addition(float a, float b);
}

public class Addition implements Add {
    public float addition(float a, float b) {
        return a+b;
    }
}
