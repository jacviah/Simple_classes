package by.jacviah.jc1.simple_classes_train.entity;

import java.util.Comparator;

public class TrainDestinationComparator implements Comparator<Train> {

    public int compare(Train a, Train b) {
        if (a.getDestinationName().compareTo(b.getDestinationName())!=0) {
            return a.getDestinationName().compareTo(b.getDestinationName());
        } else {
            return a.getDepartureTime().compareTo(b.getDepartureTime());
        }
    }
}

