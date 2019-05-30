package by.jacviah.jc1.simple_classes_train.main;

import java.util.ArrayList;
import java.util.Collections;

import by.jacviah.jc1.simple_classes_train.entity.*;
import by.jacviah.jc1.simple_classes_train.logic.*;

public class TrainDemo {
	public static void main(String[] args) {
		ArrayList<Train> trainList = new ArrayList<Train>();
		trainList.add(new Train("Brest", 246, new Time(18, 49, 02)));
		trainList.add(new Train("Hrodna", 212, new Time(15, 18, 56)));
		trainList.add(new Train("Brest", 246, new Time(12, 30, 00)));
		trainList.add(new Train("Vicebsk", 314, new Time(14, 00, 00)));
		trainList.add(new Train("Hrodna", 212, new Time(10, 36, 56)));

		TrainLogic logic = new TrainLogic();
		ArrayList<Train> t = logic.findTrainByNubner(trainList, 246);
		logic.printTrainArray(t);
		System.out.println("-------------------------------------------------");
		logic.printTrainArray(trainList);
		System.out.println("-------------------------------------------------");
		logic.sort(trainList);
		logic.printTrainArray(trainList);
		System.out.println("-------------------------------------------------");
		Collections.sort(trainList, new TrainNumberComparator());
		logic.printTrainArray(trainList);
		System.out.println("-------------------------------------------------");
		Collections.sort(trainList, new TrainDestinationComparator());
		logic.printTrainArray(trainList);

	}
}
