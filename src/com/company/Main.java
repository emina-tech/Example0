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

    public static void main(String[] args) {
        // testLichtStatusA();
        // testLichtStatusB();
        testFlugweiteStatus();
        // testGeschwindigkeit();
    }
}
