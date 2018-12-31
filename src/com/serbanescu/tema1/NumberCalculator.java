package com.serbanescu.tema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberCalculator {
    public int sigma(int n) {

        int sumaElemente = 0;
        for (int i = 1; i <= n; i++) {
            sumaElemente += i;
        }
        return sumaElemente;
    }

    public int medie(int n) {
        int valoareMedie = sigma(n) / n;
        return valoareMedie;
    }

    public int sumaInterval(int n, int o) {
        int suma = 0;
        if (n > o) {
            int aux = n;
            n = o;
            o = aux;
        }
        for (int i = n; i <= o; i++) {
            suma += i;
        }
        return suma;
    }

    public double medieInterval(int n, int o) {
        int numarator = sumaInterval(n, o);
        int numitor = Math.abs(o - n) + 1;
        return (double) numarator / numitor;

    }

    public List<Integer> fibonacciList(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        for (int i = 2; i < n; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }
        return result;
    }

    public double medieLista(List<Integer> lista) {
        long suma = 0;
        /*for (int i = 0; i <= lista.size(); i++) {
            suma += lista.get(i);
        }*/
        for (Integer item : lista) {
            suma += item;
        }
        return (double) suma / lista.size();
    }

    public boolean comparareMargini(List<Integer> lista) {
        return lista.get(0).equals(lista.get(lista.size() - 1));
    }

    public boolean comparareListe(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.size() != lista2.size()) {
            return false;
        }
        Collections.sort(lista1);
        Collections.sort(lista2);
        for (int i = 0; i < lista1.size(); i++) {
            if (!lista1.get(i).equals(lista2.get(i))) {
                return false;
            }
        }
        return true;
    }


    public List<Integer> concatenareListe(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> lista = new ArrayList<>(lista1);
        lista.addAll(lista2);
        return lista;
    }

    public Integer minimLista(List<Integer> lista) {
        return Collections.min(lista);
    }

    public Integer maximLista(List<Integer> lista) {
        return Collections.max(lista);
    }

    public int indexElementLista(List<Integer> lista, int n) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(n);
        return Collections.lastIndexOfSubList(lista, lista1);

    }

    public int numarPare(List<Integer> lista) {
        int result = 0;
        for (Integer i : lista) {
            if(i%2==0){
                result++;
            }
        }
        return result;
    }
}
