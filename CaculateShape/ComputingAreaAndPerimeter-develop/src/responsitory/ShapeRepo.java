/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsitory;

import dao.ShapeDao;
import model.Shape;

/**
 *
 * @author Nguyen Quang Hau
 */
public class ShapeRepo {

    public ShapeRepo() {
    }

    public void compute(int choice) {
        Shape shape;
        switch (choice) {
            case 1:
                shape = ShapeDao.getInstance().getRectangle();
                if (shape != null) {
                    shape.display("Rectangle");
                }
                break;
            case 2:
                shape = ShapeDao.getInstance().getCircle();
                if (shape != null) {
                    shape.display("Circle");
                }
                break;
            case 3:
                shape = ShapeDao.getInstance().getTriangle();
                if (shape != null) {
                    shape.display("Triangle");
                }
                break;
        }
    }
}
