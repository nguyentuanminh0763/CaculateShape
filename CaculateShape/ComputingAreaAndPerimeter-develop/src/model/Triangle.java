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
public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        if (sideA + sideB <= sideC || sideC + sideB <= sideA || sideA + sideC <= sideB) {
            System.out.println("3 inputed sides can not create a triangle");
            return -1;
        }
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        if (sideA + sideB <= sideC || sideC + sideB <= sideA || sideA + sideC <= sideB) {
            System.out.println("3 inputed sides can not create a triangle");
            return -1;
        }
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public Triangle getTriangle() {
        try {
            Validation val = new Validation();
            sideA = val.getDoubleData("Enter side A: ", 0.000001);
            sideB = val.getDoubleData("Enter side B: ", 0.000001);
            sideC = val.getDoubleData("Enter side C: ", 0.000001);
        } catch (Exception e) {
            System.err.println("Getting a triangle error");
            return null;
        }

        return new Triangle(sideA, sideB, sideC);
    }

}
