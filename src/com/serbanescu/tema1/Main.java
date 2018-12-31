package com.serbanescu.tema1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CommandLineReader r = new CommandLineReader();
        NumberCalculator calc = new NumberCalculator();

        //comments(r,calc);
        //marginiLista(r, calc);
        //listeEgale(r, calc);
        //lipireListeMinMaxMedie(r, calc);
        //cautareIndexElement(r,calc);
        //numerePareImpare(r,calc);
    }


    public static void numerePareImpare(CommandLineReader r, NumberCalculator calc) {
        System.out.print("Lungimea sirului : ");
        int n = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista = r.readIntList(n);
        lista.stream().forEach(integer -> {
            System.out.print(integer + " ");
        });
        int o = calc.numarPare(lista);
        System.out.println("\nNumerele pare sunt: " + o + "\nNumere impare sunt: "
                + (n - o));

    }


    public static void cautareIndexElement(CommandLineReader r, NumberCalculator calc) {
        System.out.print("Lungimea sirului : ");
        int n = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista = r.readIntList(n);
        lista.stream().forEach(integer -> {
            System.out.print(integer + " ");
        });

        System.out.print("Elementul cautat este: ");
        int o = r.readInt();

        System.out.println("Pozitia lui este " + calc.indexElementLista(lista, o));


    }


    public static void lipireListeMinMaxMedie(CommandLineReader r, NumberCalculator calc) {
        System.out.print("Lungimea sirului 1 : ");
        int n1 = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista1 = r.readIntList(n1);

        System.out.print("Lungimea sirului 2 : ");
        int n2 = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista2 = r.readIntList(n2);
        List<Integer> lista3 = calc.concatenareListe(lista1, lista2);
        System.out.println("Noul sir este: ");
        lista3.stream().forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.println("\nMaximul este: " + calc.maximLista(lista3) + "\nMinimul este: " + calc.minimLista(lista3)
                + "\nMedia este: " + calc.medieLista(lista3));
    }


    public static void listeEgale(CommandLineReader r, NumberCalculator calc) {
        System.out.print("Lungimea sirului 1 : ");
        int n1 = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista1 = r.readIntList(n1);

        System.out.print("Lungimea sirului 2 : ");
        int n2 = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista2 = r.readIntList(n2);

        System.out.println("Sunt Egale? " + calc.comparareListe(lista1, lista2));

    }


    public static void marginiLista(CommandLineReader r, NumberCalculator calc) {
        System.out.print("Lungimea sirului: ");
        int n = r.readInt();
        System.out.println("Care sunt elementele: ");
        List<Integer> lista = r.readIntList(n);
        System.out.println("Alba Neagra " + calc.comparareMargini(lista));
    }


    private static void comments(CommandLineReader r, NumberCalculator calc) {

        System.out.println("Intre ce valori sa fie: ");
        int deLa = r.readInt();
        int panaLa = r.readInt();

        System.out.println("Pana la ");
        int suma = calc.sigma(panaLa);
        System.out.println("Totalul este: " + suma);

        int medie = calc.medie(panaLa);
        System.out.println("Media este: " + medie);

        int suma2 = calc.sumaInterval(deLa, panaLa);
        System.out.println("suma este: " + suma2);

        double medie2 = calc.medieInterval(deLa, panaLa);
        System.out.println("Media este: " + medie2);

        System.out.println(calc.fibonacciList(deLa));
        System.out.print(calc.medieLista(calc.fibonacciList(deLa)));
    }
}
