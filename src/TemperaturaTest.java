import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturaTest {

    @Test
    void celsiusparaFareheit() {
        assertEquals(23, Temperatura.CelsiusparaFareheit(-5));
        assertEquals(32, Temperatura.CelsiusparaFareheit(0));
        assertEquals(64.40, Temperatura.CelsiusparaFareheit(18));
    }

    @Test
    void celsiusparaKelvin() {
        assertEquals(268.150, Temperatura.CelsiusparaKelvin(-5));
        assertEquals(273.150, Temperatura.CelsiusparaKelvin(0));
        assertEquals(291.150, Temperatura.CelsiusparaKelvin(18));

    }

    @Test
    public void ClassificaTemperaturaZero() {
        assertTrue(Temperatura.ClassificaTemperatura(-5).equals("Negativa"));
        assertTrue(Temperatura.ClassificaTemperatura(0).equals("Zero"));
        assertTrue(Temperatura.ClassificaTemperatura(18).equals("Positiva"));

    }

    @Test
    void validaConversaoCelsiusFarenheit() {
        assertTrue(Temperatura.ValidaConversaoCelsiusFarenheit(-5, 23), "True");
    }
}