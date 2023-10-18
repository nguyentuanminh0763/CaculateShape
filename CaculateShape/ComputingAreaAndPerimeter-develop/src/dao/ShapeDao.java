/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;

/**
 *
 * @author Nguyen Quang Hau
 */
public class ShapeDao {

    public static ShapeDao instance;

    public static ShapeDao getInstance() {
        if (instance == null) {
            synchronized (ShapeDao.class) {
                if (instance == null) {
                    instance = new ShapeDao();
                }
            }
        }
        return instance;
    }

    public Shape getRectangle() {
        return new Rectangle().getRectangle();
    }

    public Shape getTriangle() {
        return new Triangle().getTriangle();
    }

    public Shape getCircle() {
        return new Circle().getCircle();
    }
}
