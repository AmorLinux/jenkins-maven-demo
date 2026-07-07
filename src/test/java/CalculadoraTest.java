import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void sumarDosPositivos() {
        // modificar el resultado de una prueba para hacer que falla
        // assertEquals(5, calc.sumar(2, 3));
        assertEquals(6, calc.sumar(2, 3));
    }

    @Test
    void sumarNegativos() {
        assertEquals(-1, calc.sumar(-4, 3));
    }

    @Test
    void dividirCorrectamente() {
        assertEquals(4, calc.dividir(8, 2));
    }

    @Test
    void dividirPorCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }

    @Test
    void detectaPrimo() {
        assertTrue(calc.esPrimo(7));
        assertFalse(calc.esPrimo(8));
    }
}