package by.jacviah.jc1.simple_classes_airline.logic;

import java.util.ArrayList;
import java.util.Random;

import by.jacviah.jc1.simple_classes_airline.entity.*;

public class AirlineListLogic {

    public AirlineList findAirToDestination(AirlineList list, String destination) {
        AirlineList result = new AirlineList();
        for (Airline i : list) {
            if (i.getDestinationName().compareTo(destination)==0) {
                result.addAirline(i);
            }
        }
        return result;
    }

    public AirlineList findAirOnDay(AirlineList list, Day day) {
        AirlineList result = new AirlineList();
        for (Airline i : list) {
            if (i.getDay()==day) {
                result.addAirline(i);
            }
        }
        return result;
    }

    public AirlineList findAirOnDayAfterTime(AirlineList list, Day day, Time time) {
        AirlineList result = new AirlineList();
        for (Airline i : list) {
            if (i.getDay()==day& i.getDepartureTime().compareTo(time)>0) {
                result.addAirline(i);
            }
        }
        return result;
    }
}