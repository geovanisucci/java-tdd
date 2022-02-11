package br.com.tdd.tests;

import br.com.tdd.Calculadora;

public class CalculadoraTestes {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma;

        soma = calculadora.somar(3,7);
        System.out.println(soma);


        soma = calculadora.somar(3,0);
        System.out.println(soma);


        soma = calculadora.somar(0,0);
        System.out.println(soma);
    }
}
