package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pilot pilot1 = new Pilot("a", "11-11-1960",1);
        Pilot coPilot1 = new Pilot("b", "12-12-1980", 2);
        List<Object> listOfPilots = new ArrayList();
        listOfPilots.add(pilot1);
        listOfPilots.add(coPilot1);

        FlightAttendant flightAttendant1 = new FlightAttendant("b", "12-12-1950", true, false, true, false);
        Flight flight1 = new Flight(12, "English", 1, 2, true, true );

    }
}