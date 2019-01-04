package com.serbanescu.tema2.ex4;

public class Main {

    public static void main(String[] args) {

        Reader r = new Reader();
        Security sec = new Security();
        System.out.println("Utilizatorul: \n");
        String username = r.readString();
        System.out.println("Parola: \n");
        String password = r.readString();
        User user = new User(username, password);
        Board board = new Board();

        if (sec.checkUser(user)) {
            System.out.println("1 pentru a vedea board-ul \n2 pentru a adauga un mesaj nou \nOrice pentru a termina");
            int n = r.readInt();
            while (n == 1 || n == 2) {
                switch (n) {
                    case 1: {
                        System.out.println(board.getMessages());
                        break;
                    }
                    case 2: {
                        System.out.println("Mesajul care doriti sa-l adaugati: \n");
                        String msg=r.readString();
                        Message m = new Message(msg,user.getUsername());
                        board.addMessage(m);
                        System.out.println("Done");
                        break;
                    }
                }
                System.out.println("1 pentru a vedea board-ul \n2 pentru a adauga un mesaj nou \nOrice pentru a termina");
                n=r.readInt();
            }
        } else {
            System.out.println("Credentiale gresite!");
        }


    }
}
