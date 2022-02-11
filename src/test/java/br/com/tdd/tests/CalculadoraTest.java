package br.com.tdd.tests;

import br.com.tdd.Calculadora;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);

        Assert.assertEquals(10,soma);
    }
}
