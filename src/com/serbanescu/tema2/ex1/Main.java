package com.serbanescu.tema2.ex1;


public class Main {


    public static void main(String[] args) {
        Reader r = new Reader();
        System.out.print("Pentru ce forma calculam? \n 0 pentru cerc \n 1 pentru  dreptunghi \n 2 pentru triunghi \n ");
        int comanda = r.readInt();

        Forma forma = FormaFactory.createForma(comanda);
        System.out.println(forma.getPerimeter());
    }
}
