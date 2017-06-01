package com.tiagolimadev.tads.test.calculadora;

public class Calculadora {

    private int resultado_soma;

    public void somar(int arg1, int arg2) {
        resultado_soma = arg1 + arg2;
    }

    public int getResultadoSoma() {
        return resultado_soma;
    }

}
