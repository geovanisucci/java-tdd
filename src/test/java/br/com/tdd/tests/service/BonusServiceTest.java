package br.com.tdd.tests.service;

import br.com.tdd.modelo.Funcionario;
import br.com.tdd.service.BonusService;
import static org.junit.Assert.assertEquals; //Importe estatico
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,
                () -> service.calcularBonus(new Funcionario("Test", LocalDate.now(), new BigDecimal("15000"))));
    }
    @Test
    void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Test", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.0"), bonus);
    }
    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Test", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }

}
