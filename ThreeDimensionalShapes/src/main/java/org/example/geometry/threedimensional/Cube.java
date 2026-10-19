package org.example.geometry.threedimensional;

public class Cube implements ThreeDimensionalShape{
    private double side;
    public Cube(double side){
        this.side=side;
    }
    @Override
    public double calculateSurfaceArea(){
        return 6 * side * side;
    }
    @Override
    public double calculateVolume(){
        return side * side * side;
    }
}
