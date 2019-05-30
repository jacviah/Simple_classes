package by.jacviah.jc1.simple_classes_triangle.entity;

import java.util.Objects;

public class Mediana {
    double x;
    double y;

    public Mediana(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mediana mediana = (Mediana) o;
        return Double.compare(mediana.x, x) == 0 &&
                Double.compare(mediana.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Mediana{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
