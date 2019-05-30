package by.jacviah.jc1.simple_classes_train.entity;

import java.util.Comparator;

public class TrainNumberComparator implements Comparator<Train> {
    public int compare(Train a, Train b) {
        return a.getNumber() - b.getNumber();
    }
}
