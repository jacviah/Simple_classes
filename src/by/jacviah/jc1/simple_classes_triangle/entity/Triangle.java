package by.jacviah.jc1.simple_classes_triangle.entity;

import java.util.Objects;

public class Triangle {

    private Point one;
    private Point two;
    private Point three;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(Point one, Point two, Point three) {

        double a = (two.getY() - one.getY()) / (two.getX() - one.getX());
        double b = one.getY() - a * one.getX();

        if (Double.compare((a * three.getX() + b), three.getY()) == 0) {
            System.out.println("All three points lie on the same line");
        } else if (!one.equals(two) & (!one.equals(three)) & (!two.equals(three))) {
            this.one = one;
            this.two = two;
            this.three = three;
            this.side1 = Math.sqrt(Math.pow(three.getX() - two.getX(), 2) + Math.pow(three.getY() - two.getY(), 2));
            this.side2 = Math.sqrt(Math.pow(three.getX() - one.getX(), 2) + Math.pow(three.getY() - one.getY(), 2));
            this.side3 = Math.sqrt(Math.pow(one.getX() - two.getX(), 2) + Math.pow(one.getY() - two.getY(), 2));
        } else {
            System.out.println("you input one point twice");
        }
    }

    public Point getOne() {
        return one;
    }

    public Point getTwo() {
        return two;
    }

    public Point getThree() {
        return three;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Objects.equals(one, triangle.one) | Objects.equals(one, triangle.two) | Objects.equals(one, triangle.three)) &&
                (Objects.equals(two, triangle.one) | Objects.equals(two, triangle.two) | Objects.equals(two, triangle.three)) &&
                (Objects.equals(three, triangle.one) | Objects.equals(three, triangle.two) | Objects.equals(three, triangle.three));
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two, three);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }
}
