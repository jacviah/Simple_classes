package by.jacviah.jc1.simple_classes_train.logic;

import java.util.ArrayList;

import by.jacviah.jc1.simple_classes_train.entity.*;

public class TrainLogic {

	public ArrayList<Train> findTrainByNubner(ArrayList<Train> list, int num) {
		ArrayList<Train> result = new ArrayList<Train>();
		for (Train i : list) {
			if (i.getNumber() == num) {
				result.add(i);
			}
		}
		return result;
	}

	public void printTrainArray(ArrayList<Train> list) {
		TimeLogic logic = new TimeLogic();
		for (Train i : list) {
			System.out.print(i.getNumber() + " - " + i.getDestinationName() + " - ");
			logic.printTime(i.getDepartureTime());
		}
	}

	public void sort(ArrayList<Train> list) {
		Train t;
		int i = 0;
		while (i < list.size() - 2) {

			if (list.get(i).getDestinationName().compareTo(list.get(i + 1).getDestinationName()) < 0) {
				i++;
			}

			if (list.get(i).getDestinationName().compareTo(list.get(i + 1).getDestinationName()) == 0) {
				if (list.get(i).getDepartureTime().compareTo(list.get(i + 1).getDepartureTime()) < 0) {
					i++;
					continue;
				}

				if (list.get(i).getDepartureTime().compareTo(list.get(i + 1).getDepartureTime()) > 0) {
					t = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, t);
					if (i > 0) {
						i--;
					}
					continue;
				}
			}

			if (list.get(i).getDestinationName().compareTo(list.get(i + 1).getDestinationName()) > 0) {
				t = list.get(i);
				list.set(i, list.get(i + 1));
				list.set(i + 1, t);
				if (i > 0) {
					i--;
				}
			}
		}
	}
}
