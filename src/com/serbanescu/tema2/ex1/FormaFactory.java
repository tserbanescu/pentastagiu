package com.serbanescu.tema2.ex1;

public class FormaFactory {
    public static Forma createForma(int comanda) {
        Reader reader = new Reader();
        switch (comanda) {
            case 0: {
                System.out.println("Cat sa fie raza? ");
                double raza = reader.readDouble();
                return new Cerc(raza);
            }
            case 1: {
                System.out.println("Cat sa fie lungimea? ");
                double lungime = reader.readDouble();
                System.out.println("Cat sa fie latimea? ");
                double latime = reader.readDouble();
                return new Dreptunghi(lungime, latime);
            }
            case 2: {
                System.out.println("Cat sa fie prima latura? ");
                double primaLatura = reader.readDouble();
                System.out.println("Cat sa fie a doua latura? ");
                double aDouaLatura = reader.readDouble();
                System.out.println("Cat sa fie a treia latura? ");
                double aTreiaLatura = reader.readDouble();
                return new Triunghi(primaLatura, aDouaLatura, aTreiaLatura);
            }

        }
        throw new RuntimeException("Invalid Number");

    }
}