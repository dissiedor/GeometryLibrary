package org.example.geometry.threedimensional;

public class Sphere implements ThreeDimensionalShape {
    private double radius;
    public Sphere (double radius){
        this.radius=radius;
    }
    @Override
    public double calculateSurfaceArea(){
        return Math.PI*4*radius*radius;
    }
    @Override
    public double calculateVolume(){
        return Math.PI*radius*radius*radius*(4.0/3.0);
    }
}
