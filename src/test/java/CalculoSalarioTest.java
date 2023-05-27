import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculoSalarioTest {
    @Test
    void deveCalcularSalario() {
        Funcionario funcionario = new Funcionario("Thales", 20, 20, 2);

        double expectedResult = ((20-2) / 100.0 + 1) * 20 * 10;

        assertEquals(expectedResult, funcionario.calcularSalario(10), 0.1);
    }
}
