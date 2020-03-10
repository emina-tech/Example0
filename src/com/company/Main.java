package com.company;

public class Main {
    public static String lichtStatusA(int schalter) {
        if (schalter > 1)
            return "Licht an!";

        return "Licht aus!";
    }

    public static void testLichtStatusA() {
        System.out.println("Tests fuer Methode testLichtStatusA...");

        // Test fuer schalter = 0
        System.out.print("\tRueckwert von lichtStatusA(0) ist: ");
        System.out.println(lichtStatusA(0));

        // Alternativno:
        // int schalter = 0;
        // String rezultat = lichtStatusA(schalter);
        // System.out.print("\tRueckwert von lichtStatusA(0) ist: ");
        // System.out.println(rezultat);

        // Test fuer schalter = 1
        System.out.print("\tRueckwert von lichtStatusA(1) ist: ");
        System.out.println(lichtStatusA(1));

        // Test fuer schalter = 2
        System.out.print("\tRueckwert von lichtStatusA(2) ist: ");
        System.out.println(lichtStatusA(2));

        // Test fuer schalter = 3
        System.out.print("\tRueckwert von lichtStatusA(3) ist: ");
        System.out.println(lichtStatusA(3));

        System.out.println("----------------------------------");
    }

    public static String lichtStatusB(int schalter) {
        if (schalter == 1) {
            return "Licht an!";
        }

        return "Licht aus!";
    }

    public static void testLichtStatusB() {
        System.out.println("Tests fuer Methode testLichtStatusB...");

        // Test fuer schalter = 0
        System.out.print("\tRueckwert von lichtStatusB(0) ist: ");
        System.out.println(lichtStatusB(0));

        // Test fuer schalter = 1
        System.out.print("\tRueckwert von lichtStatusB(1) ist: ");
        System.out.println(lichtStatusB(1));

        // Test fuer schalter = 2
        System.out.print("\tRueckwert von lichtStatusB(2) ist: ");
        System.out.println(lichtStatusB(2));

        // Test fuer schalter = 3
        System.out.print("\tRueckwert von lichtStatusB(3) ist: ");
        System.out.println(lichtStatusB(3));

        System.out.println("----------------------------------");
    }


    //Bspl 2


    public static String flugweiteStatus(double flugweite) {
        if (flugweite > 198.7)
            return "1. Platz";
        if (flugweite <= 198.7 && flugweite > 197.1)
            return "2. Platz";
        if (flugweite <= 197.1 && flugweite > 195)
            return "3. Platz";
        if (flugweite <= 195 && flugweite > 193.67)
            return "4. Platz";
        if (flugweite <= 193.67 && flugweite > 150)
            return "Nicht definiert";
        if (flugweite <= 150 && flugweite > 100)
            return "Ausgeschieden";
        if (flugweite <= 100 && flugweite > 50)
            return "Nicht definiert";
        if (flugweite < 50 && flugweite > 20)
            return "Warnung: Rettung rufen!";

        return "Nicht definiert";
    }

    public static void testFlugweiteStatus() {
        System.out.println("Tests fuer Methode testFlugweite...");

        // Test fuer flugweite = 200
        System.out.print("\tRueckwert von flugweiteStatus(200) ist: ");
        System.out.println(flugweiteStatus(200.0));

        // Test fuer flugweite = 198.5
        System.out.print("\tRueckwert von flugweiteStatus(198.5) ist: ");
        System.out.println(flugweiteStatus(198.5));

        // Test fuer flugweite = 196
        System.out.print("\tRueckwert von flugweiteStatus(196) ist: ");
        System.out.println(flugweiteStatus(196));

        // Test fuer flugweite = 194.5
        System.out.print("\tRueckwert von flugweiteStatus(194.5) ist: ");
        System.out.println(flugweiteStatus(194.5));

        // Test fuer flugweite = 175.5
        System.out.print("\tRueckwert von flugweiteStatus(175.5) ist: ");
        System.out.println(flugweiteStatus(175.5));

        // Test fuer flugweite = 110.8
        System.out.print("\tRueckwert von flugweiteStatus(110.8) ist: ");
        System.out.println(flugweiteStatus(110.8));

        // Test fuer flugweite = 55.5
        System.out.print("\tRueckwert von flugweiteStatus(55.5) ist: ");
        System.out.println(flugweiteStatus(155.5));

        // Test fuer flugweite = 35
        System.out.print("\tRueckwert von flugweiteStatus(35) ist: ");
        System.out.println(flugweiteStatus(35));

        // Test fuer flugweite = 15.7
        System.out.print("\tRueckwert von flugweiteStatus(15.7) ist: ");
        System.out.println(flugweiteStatus(15.7));


        System.out.println("----------------------------------");

    }


    //Bspl3

    public static int geschwindigkeit(int gang) {
        /*
        if (gang == 1) {
            return 10;
        }
        else if (gang == 2) {
            return 20;
        }
        else if (gang == 3) {
            return 30;
        }
        else if (gang == 4) {
            return 40;
        }

        return -1;
         */
        switch (gang) {
            case 1:
                return 10;
            case 2:
                return 20;
            case 3:
                return 30;
            case 4:
                return 40;
        }

        return -1;
    }

    public static void testGeschwindigkeit() {
        System.out.println("Tests fuer Methode geschwindigkeit...");

        // Test fuer gang = 1
        System.out.print("\tRueckwert von geschwindigkeit(1) ist: ");
        System.out.println(geschwindigkeit(1) + "km/h");

        // Test fuer gang = 2
        System.out.print("\tRueckwert von geschwindigkeit(2) ist: ");
        System.out.println(geschwindigkeit(2) + "km/h");

        // Test fuer gang = 3
        System.out.print("\tRueckwert von geschwindigkeit(3) ist: ");
        System.out.println(geschwindigkeit(3) + "km/h");

        // Test fuer gang = 4
        System.out.print("\tRueckwert von geschwindigkeit(4) ist: ");
        System.out.println(geschwindigkeit(4) + "km/h");

        // Test fuer gang = 5
        System.out.print("\tRueckwert von geschwindigkeit(5) ist: ");
        System.out.println(geschwindigkeit(5) + "km/h");

        System.out.println("----------------------------------");

    }

    // Bspl 4 / Blumen gießen a)

    public static int giessdauer(double feuchtigkeit) {
        if (feuchtigkeit < 0.2) {
            return 5;
        } else if (feuchtigkeit >= 0.2 && feuchtigkeit < 0.4) {
            return 3;
        } else if (feuchtigkeit >= 0.4 && feuchtigkeit <= 0.75)
            return 1;

        return 0;

    }

    public static void testGiessdauer() {

        System.out.println("Test fuer Methode giessdauer...");

        //Test fuer feuchtigkeit = 0.19
        System.out.print("Rueckwert von giessdauer(0.19) ist: ");
        System.out.println(giessdauer(0.19) + " Sekunden");

        //Test fuer feuchtigkeit = 0.3
        System.out.print("Rueckwert von giessdauer(0.3) ist: ");
        System.out.println(giessdauer(0.3) + " Sekunden");

        //Test fuer feuchtigkeit = 0.55
        System.out.print("Rueckwert von giessdauer(0.55) ist: ");
        System.out.println(giessdauer(0.55) + " Sekunden");

        //Test fuer feuchtigkeit = 0.8
        System.out.print("Rueckwert von giessdauer(0.8) ist: ");
        System.out.println(giessdauer(0.8) + " Sekunden");

        System.out.println("----------------------------------");


    }

    // Bspl 5 Blumen gießen b)

    public static double wassergehalt(int pflanzeNummer) {
        if (pflanzeNummer == 1) {
            return 0.99;
        } else if (pflanzeNummer == 2) {
            return 0.95;
        } else if (pflanzeNummer == 3) {
            return 0;
        } else if (pflanzeNummer == 4) {
            return 0.98;
        } else {
            return 0.99;
        }
    }

    public static void testWassergehalt() {
        System.out.println("Test fuer Methode wassergehalt...");

        //Test fuer pflanzeNumer = 1
        System.out.print("Rueckwert von pflanzeNummer(1) ist: ");
        System.out.println(wassergehalt(1));

        //Test fuer pflanzeNumer = 2
        System.out.print("Rueckwert von pflanzeNummer(2) ist: ");
        System.out.println(wassergehalt(2));

        //Test fuer pflanzeNumer = 3
        System.out.print("Rueckwert von pflanzeNummer(3) ist: ");
        System.out.println(wassergehalt(3));

        //Test fuer pflanzeNumer = 4
        System.out.print("Rueckwert von pflanzeNummer(4) ist: ");
        System.out.println(wassergehalt(4));

        //Test fuer pflanzeNumer =5
        System.out.print("Rueckwert von pflanzeNummer(5) ist: ");
        System.out.println(wassergehalt(5));

    }



    public static void main(String[] args) {
        // testLichtStatusA();
        // testLichtStatusB();
        // testFlugweiteStatus();
        // testGeschwindigkeit();
        // testGiessdauer();
        /*double feuchtigkeit = 0.5;
        if (giessdauer(feuchtigkeit) == 0 )
            System.out.println("Not neccessary!");
        else
            System.out.println("Neccessary!");*/
        testWassergehalt();
    }
}
