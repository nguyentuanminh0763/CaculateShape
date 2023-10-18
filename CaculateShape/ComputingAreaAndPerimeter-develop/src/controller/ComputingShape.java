/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import responsitory.ShapeRepo;
import view.Menu;

/**
 *
 * @author Nguyen Quang Hau
 */
public class ComputingShape extends Menu<String> {
    private ShapeRepo shapeRepo;

    public ComputingShape() {
        super("Calculator Shape Program", new String[]{"Rectangle", "Cicle", "Triangle", "Exit"});
        shapeRepo = new ShapeRepo();
    }

    @Override
    public void excute(int n) {
        switch (n) {
            case 1 -> shapeRepo.compute(1);
            case 2 -> shapeRepo.compute(2);
            case 3 -> shapeRepo.compute(3);
        }
    }

}
