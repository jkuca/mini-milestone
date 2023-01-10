package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends Employee {


    private int ID;
    Pilot(String Name, String BirthDay, int ID){
        super(Name, BirthDay);
        this.ID = ID;
    }

}
