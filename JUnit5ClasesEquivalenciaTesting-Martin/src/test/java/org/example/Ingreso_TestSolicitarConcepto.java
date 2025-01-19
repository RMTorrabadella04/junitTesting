package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ingreso_TestSolicitarConcepto {

    @Test
    void solicitarConcepto() {
        Ingreso ingreso = new Ingreso();
        
        String input2 = "Nómina\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        assertEquals("Nómina", ingreso.solicitarConcepto());
    }

}