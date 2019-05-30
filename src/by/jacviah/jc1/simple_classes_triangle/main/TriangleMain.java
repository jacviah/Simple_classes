package by.jacviah.jc1.simple_classes_triangle.main;

import by.jacviah.jc1.simple_classes_triangle.entity.*;
import by.jacviah.jc1.simple_classes_triangle.logic.TriangleLogic;

public class TriangleMain {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(new Point(1,10), new Point(3, 4), new Point(4,9));
		System.out.println(t1.toString());
		Triangle t2 = new Triangle(new Point(1,1), new Point(4, 3), new Point(3,4));
		System.out.println(t2.equals(t1));
		TriangleLogic logic = new TriangleLogic();
		System.out.println(	logic.getMediana(t1));
		System.out.println(logic.getPerimeter(t1));
		System.out.println(logic.getSize(t1));
	}

}
