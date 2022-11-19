package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.execute(15, 48, '*');

        TriangleDetector detector = new TriangleDetector();
        detector.isExists(10,11,12);

        System.out.println("Hello world!");
    }
}