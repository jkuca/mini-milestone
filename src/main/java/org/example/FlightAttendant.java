package org.example;

import java.util.ArrayList;
import java.util.List;

public class FlightAttendant extends Employee {

    private boolean speaksGerman;
    private boolean speaksEnglish;
    private boolean speaksSpanish;
   private boolean speaksPolish;

    FlightAttendant(String Name, String BirthDay, boolean speaksGerman, boolean speaksEnglish, boolean speaksSpanish, boolean speaksPolish) {
        super(Name, BirthDay);

         this.speaksGerman = speaksGerman;
         this.speaksEnglish = speaksEnglish;
         this.speaksSpanish = speaksSpanish;
         this.speaksPolish = speaksPolish;

    }
}
