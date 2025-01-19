package org.example;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ingreso_TestAgregarIngreso {

    @Test
    void agregarIngreso() {
        Ingreso ingreso2 = new Ingreso();

        String input2 = "Nómina\n100.0\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        ingreso2.agregarIngreso();
        assertEquals(85.0, ingreso2.getSaldo());
    }

}