package com.example.consola;

import java.util.ArrayList;

public class Operacion {
    public int suma(ArrayList<Integer> numeros){
        int resultado=0;
        for (Integer numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
