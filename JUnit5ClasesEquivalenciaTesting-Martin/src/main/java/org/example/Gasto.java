package org.example;

import java.util.HashMap;
import java.util.Map;

public class Gasto {
    private Map<String, Double> gastos;
    private double saldo;
    private BaseDatos db;

    public Gasto(double saldoInicial, BaseDatos db) {
        this.gastos = new HashMap<>();
        this.gastos.put("Vacaciones", 0.0);
        this.gastos.put("Alquiler", 0.0);
        this.gastos.put("Vicios", 0.0);
        this.saldo = saldoInicial;
        this.db = db;
    }

    public void agregarGasto(String dni) {
        String concepto = solicitarConcepto();
        System.out.println("Ingrese la cantidad:");
        double cantidad = solicitarCantidad();

        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. No se puede realizar el gasto.");
        } else {
            gastos.put(concepto, gastos.get(concepto) + cantidad);
            saldo -= cantidad;
            // Actualizamos el saldo en la base de datos
            db.actualizarSaldo(dni, saldo);
            System.out.println("Gasto registrado en el concepto: " + concepto + ". Cantidad: " + cantidad);
            System.out.println("Saldo actual: " + saldo);
        }
    }

    public String solicitarConcepto() {
        while (true) {
            System.out.println("Ingrese el concepto (Vacaciones/Alquiler/Vicios):");
            String concepto = Main.scanner.nextLine();
            if (gastos.containsKey(concepto)) {
                return concepto;
            }
            System.out.println("Concepto no válido. Los conceptos permitidos son: Vacaciones, Alquiler, Vicios.");
        }
    }

    public double solicitarCantidad() {
        while (true) {
            try {
                double cantidad = Double.parseDouble(Main.scanner.nextLine());
                if (cantidad >= 0) {
                    return cantidad;
                } else {
                    System.out.println("La cantidad no puede ser negativa. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Introduzca un número válido.");
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Map<String, Double> getGastos() {
        return gastos;
    }
}
