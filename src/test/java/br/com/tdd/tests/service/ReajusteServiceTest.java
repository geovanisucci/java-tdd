package br.com.tdd.tests.service;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;
import br.com.tdd.service.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    //AfterEach -> executa depois de executar cada método de teste
    //BeforeAll -> executa antes de todos os métodos
    //AfterAll -> executa depois de todos os métodos

    @BeforeEach
    public void inicializar(){
        service = new ReajusteService();
        funcionario = new Funcionario("Test", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForBom(){

        service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForOtimo(){

        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
