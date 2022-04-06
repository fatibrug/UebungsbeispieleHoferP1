package com.company;

public class StrafenDemo {

    public static void main(String[] args) {

        Strafen robi = new Strafen();

        robi.vorname = "Robert";
        robi.nachname = "Müller";
        robi.kennzeichen = "G 543 RB";
        robi.strafnummer = 54323;

        robi.strafe(50);
        robi.verbandspacket();
        robi.alkohol(2.3);
        robi.sonstiges(50.0);
        robi.getStrafe();

        System.out.println(robi.getStrafe());




    }
}
