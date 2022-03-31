package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {
    @Test
    public void main() {

        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
        assertEquals(getDescuentoTest(p3.getPrecio()), p3.getDescuento());
    }

    public double getDescuentoTest(double precio) {
    return precio * 0.1d;
    }
}