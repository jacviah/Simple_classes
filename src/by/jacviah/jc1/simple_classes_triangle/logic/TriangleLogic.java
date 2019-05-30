package by.jacviah.jc1.simple_classes_triangle.logic;

import by.jacviah.jc1.simple_classes_triangle.entity.*;

public class TriangleLogic {

    public double getPerimeter(Triangle t) {
        return t.getSide1() + t.getSide2() + t.getSide3();
    }

    public double getSize(Triangle t) {
        double p = 0.5 * this.getPerimeter(t);
        return Math.sqrt(p * (p - t.getSide1()) * (p - t.getSide2()) * (p - t.getSide3()));

    }

    public Mediana getMediana(Triangle t) {
        double a = (t.getOne().getX() + t.getTwo().getX() + t.getThree().getX()) / 3.0;
        double b = (t.getOne().getY() + t.getTwo().getY() + t.getThree().getY()) / 3.0;
        return new Mediana(a, b);
    }

}
