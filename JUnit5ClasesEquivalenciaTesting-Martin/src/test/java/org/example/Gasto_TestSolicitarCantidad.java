package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Gasto_TestSolicitarCantidad {


    @Test
    void testSolicitarCantidad() {
        Gasto gasto = new Gasto(0.0, new BaseDatos());

        String input2 = "100.0\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        assertEquals(100.0, gasto.solicitarCantidad());
    }
}
