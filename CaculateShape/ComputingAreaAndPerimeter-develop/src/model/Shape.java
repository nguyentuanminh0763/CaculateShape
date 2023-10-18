/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Quang Hau
 */
public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    public void display(String shape) {
         System.out.println("---------- "+shape+" -----------");
         System.out.println("Perimeter: "+getPerimeter());
         System.out.println("Area: "+getArea());
     }
}
