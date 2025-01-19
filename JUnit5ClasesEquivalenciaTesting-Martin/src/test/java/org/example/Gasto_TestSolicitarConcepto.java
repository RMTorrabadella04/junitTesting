package org.example;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class Gasto_TestSolicitarConcepto {

    @Test
    void testSolicitarConcepto() {
        Gasto gasto = new Gasto(0.0, new BaseDatos());

        String input2 = "Vacaciones\n";
        InputStream inputStream2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(inputStream2);

        assertEquals("Vacaciones", gasto.solicitarConcepto());
    }


}
