package org.example;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Gasto_TestAgregarGasto {

    @Test
    void agregarGasto() {
        Gasto gasto2 = new Gasto(1000.0, new BaseDatos());

        String input2 = "Vacaciones\n100.0\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        gasto2.agregarGasto("12345678A");
        assertEquals(900.0, gasto2.getSaldo());
    }


}
