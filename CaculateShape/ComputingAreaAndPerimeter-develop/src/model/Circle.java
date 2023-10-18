/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Circle extends Shape {

    private double radius;
    
    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        if (radius < 0) {
            System.out.println("Radius is not negative or equal 0");
            return -1;
        }
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea() {
        if (radius < 0) {
            System.out.println("Radius is not negative or equal 0");
            return -1;
        }
        return Math.PI * radius * radius;
    }
    
    public Circle getCircle() {
        try {
            Validation val = new Validation();
            radius = val.getDoubleData("Enter radius: ", 0.000001);
        } catch (Exception e) {
            System.err.println("Getting cricle error");
            return null;
        }
        return new Circle(radius);
    }
}
