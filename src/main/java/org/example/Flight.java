package org.example;

public class Flight {

    private int ID;
    private String lang;

    private int coPilotId;

    private int pilotId;
    private boolean pilotReceivedCompass;
    private boolean CoPilotReceivedCompass;

//    enum Languages {
//        ONE, TWO,
//    }

    Flight (int ID, String lang, int pilotID, int coPilotID, boolean pilotReceivedCompass, boolean coPilotReceivedCompass){
        this.ID = ID;
        this.lang = lang;
        this.pilotId = pilotID;
        this.coPilotId = coPilotID;
        this.CoPilotReceivedCompass = coPilotReceivedCompass;
        this.pilotReceivedCompass = pilotReceivedCompass;
        }

       public boolean getPilotAndCopilotReceivedCompass(){
            return pilotReceivedCompass & pilotReceivedCompass;
        }

        public void setPiloAndCopilottReceivedCompass(){
            if (!pilotReceivedCompass) pilotReceivedCompass = true;
            if(!CoPilotReceivedCompass) CoPilotReceivedCompass = true;
        }

        public boolean isFlightReady(){
            return true;
        }
}
