package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ingreso_TestSolicitarCantidad {

    @Test
    void testSolicitarCantidad() {
        Ingreso ingreso = new Ingreso();

        String input2 = "100.0\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        assertEquals(100.0, ingreso.solicitarCantidad());
    }

}