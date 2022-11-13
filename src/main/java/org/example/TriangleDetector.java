package org.example;

public class TriangleDetector {

    public TriangleDetector(){

    }

    public boolean isExists(double a, double b, double c){
        boolean isExists = false;

        if(a + b > c && a + c > b && b + c > a){
            isExists = true;
        }

        return isExists;
    }

}
