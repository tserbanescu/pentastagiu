package com.serbanescu.tema2.ex2;

public class Main {

    public static void main(String[] args) {
        Reader r = new Reader();
        Banca banca = new Banca();

        System.out.println("Ce operatiune doriti sa faceti? \n 0 pentru verificare sold \n 1 pentru adaugare numerar \n 2 pentru retragere numerar");
        int comanda = r.readInt();
        while(comanda<=2&&comanda>=0){
            switch (comanda) {
                case 0: {
                    System.out.println("Soldul este: " + banca.verficareSold());
                    break;
                }
                case 1: {
                    System.out.println("Cat doriti sa adaugati? \n");
                    double adaugare = r.readDouble();
                    banca.adaugareBani(adaugare);
                    System.out.println("Soldul curent este :" + banca.verficareSold());
                    break;
                }
                case 2: {
                    System.out.println("Cat doriti sa retrageti? \n");
                    double retragere = r.readDouble();
                    banca.retragereBani(retragere);
                    System.out.println("Soldul curent este :" + banca.verficareSold());
                    break;
                }
            }
            System.out.println("Ce operatiune doriti sa mai faceti? \n 0 pentru verificare sold \n 1 pentru adaugare numerar \n 2 pentru retragere numerar\n 3 pentru terminare");
            comanda=r.readInt();
        }
    }
}
