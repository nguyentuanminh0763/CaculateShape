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
public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        if (width <= 0 || length <= 0) {
            System.out.println("Width or length is not negative number or equal 0");
            return -1;
        }
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        if (width <= 0 || length <= 0) {
            System.out.println("Width or length is not negative number or equal 0");
            return -1;
        }
        return width * length;
    }

    public Rectangle getRectangle() {
        try {
            Validation val = new Validation();
            width = val.getDoubleData("Enter width: ", 0.00001);
            length = val.getDoubleData("Enter length: ", 0.00001);
        } catch (Exception e) {
            System.err.println("Getting Rectangle error");
            return null;
        }
        
        return new Rectangle(width, length);
    }

}
