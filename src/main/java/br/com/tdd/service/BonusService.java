package br.com.tdd.service;

import br.com.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario){
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));

        if (valor.compareTo(new BigDecimal("1000")) > 0){
            throw new IllegalArgumentException("Funcionário com salário maior do que R$ 10 mil não pode receber bônus.");
        }
        return valor;
    }
}
