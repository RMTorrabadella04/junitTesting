package org.example;

import java.util.HashMap;
import java.util.Map;

public class Ingreso {
    private Map<String, Double> ingresos;
    private double saldo;

    public Ingreso() {
        this.ingresos = new HashMap<>();
        this.ingresos.put("Nómina", 0.0);
        this.ingresos.put("Venta segunda mano", 0.0);
        this.saldo = 0.0;
    }

    public void agregarIngreso() {
        String concepto = solicitarConcepto();
        System.out.println("Ingrese la cantidad:");
        double cantidad = solicitarCantidad();

        if (concepto.equals("Nómina")) {
            // Calcular el IRPF del 15%
            double irpf = cantidad * 0.15;
            System.out.println("El IRPF (15%) es: " + irpf);
            cantidad = cantidad - irpf;  // Descontar IRPF
            System.out.println("Cantidad después de IRPF: " + cantidad);
        }

        ingresos.put(concepto, ingresos.get(concepto) + cantidad);
        saldo += cantidad;
        System.out.println("Ingreso registrado. Saldo actual: " + saldo);
    }

    public String solicitarConcepto() {
        while (true) {
            System.out.println("Ingrese el concepto (Nómina/Venta segunda mano):");
            String concepto = Main.scanner.nextLine();
            if (ingresos.containsKey(concepto)) {
                return concepto;
            }
            System.out.println("Concepto no válido. Los conceptos permitidos son: Nómina, Venta segunda mano.");
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

    public Map<String, Double> getIngresos() {
        return ingresos;
    }
}
