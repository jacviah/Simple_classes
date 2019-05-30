package by.jacviah.jc1.simple_classes_airline.main;

import static by.jacviah.jc1.simple_classes_airline.entity.AirType.*;
import static by.jacviah.jc1.simple_classes_airline.entity.Day.*;

import by.jacviah.jc1.simple_classes_airline.entity.*;
import by.jacviah.jc1.simple_classes_airline.logic.*;



public class AirlineDemo {
    public static void main(String[] args) {
        Airline air1 = new Airline("Tokio", 461, WIDE, SUNDAY, new Time(14, 25, 5));
        Airline air2 = new Airline("New York", 351, WIDE, MONDAY, new Time(18, 15, 19));
        Airline air3 = new Airline("London", 411, NARROW, FRIDAY, new Time(11, 23, 4));
        Airline air4 = new Airline("Tokio", 426, WIDE, FRIDAY, new Time(23, 3, 0));
        Airline air5 = new Airline("Rome", 382, NARROW, SUNDAY, new Time(6, 40, 20));

        AirlineList list = new AirlineList();
        list.addAirline(air1);
        list.addAirline(air2);
        list.addAirline(air3);
        list.addAirline(air4);
        list.addAirline(air5);

        list.print();
        System.out.println("-------------------------------------");
        AirlineListLogic logic = new AirlineListLogic();
        logic.findAirToDestination(list, "Tokio").print();
        System.out.println("-------------------------------------");
        logic.findAirOnDay(list, FRIDAY).print();
        System.out.println("-------------------------------------");
        logic.findAirOnDayAfterTime(list, FRIDAY, new Time(14,30,00)).print();
    }
}
