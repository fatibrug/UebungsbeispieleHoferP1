package com.company;

public class Strafen {


    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;


    public void strafe(int geschwindigkeitsueberschreitung) {

        if (geschwindigkeitsueberschreitung >= 100) {
            strafe += 1500;
        } else if (geschwindigkeitsueberschreitung >= 50) {
            strafe += 500;
        } else if (geschwindigkeitsueberschreitung >= 30) {
           strafe += 100;
        } else if (geschwindigkeitsueberschreitung >= 20) {
            strafe += 50;
        } else {
          strafe += 30;
        }
        anzahl += 1;
    }

    public void verbandspacket() {

        strafe += 25;
        anzahl += 1;
    }

    public void alkohol(double wert){

        if(wert >= 3.0){
            strafe += 5000;
        }else if (wert > 2.0){
           strafe += 1000;
        }else if ( wert >1.0){
            strafe += 400;
        }else if(wert > 0.5){
           strafe += 100;
        }
        anzahl +=2;

    }

    public void sonstiges(double wert){

      strafe += wert;
      anzahl += 1;
    }

    public double getStrafe(){

        if(anzahl  == 1) {
            return strafe - (strafe * 0.3);
        }else if (anzahl == 2){
            return strafe - (strafe * 0.2);
        }else if (anzahl == 3){
            return strafe - (strafe * 0.1);
        }else if( anzahl >= 4){
            return strafe;
        }else {
            return 0;
        }

    }


}