package by.jacviah.jc1.simple_classes_airline.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class AirlineList implements Iterable<Airline> {
    ArrayList<Airline> list = new ArrayList<Airline>();

    public void addAirline(Airline airline) {
        if (airline.getDestinationName() != null &airline.getDepartureTime()!=null& airline.getDay()!=null) {
            boolean flag = true;
            for (Airline  i : list) {
                if (i == airline ) {
                    flag = false;
                }
            }
            if (flag) {
                list.add(airline);
            } else {
                System.out.println("Airline is already in the list");
            }
        } else {
            System.out.println("You must fill in the details all parameters");
        }
    }

    public void deleteAirline(Airline airline) {

            boolean flag = true;
            for (Airline  i : list) {
                if (i == airline ) {
                    flag = false;
                }
            }
            if (flag) {
                list.remove(airline);
            } else {
                System.out.println("Airline isn't already in the list");
            }
    }

    public void print() {
        for (Airline  i : list) {
            System.out.println(i);
        }
    }

    @Override
    public Iterator<Airline> iterator() {
        return list.iterator();
    }

}
