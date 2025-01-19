package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BaseDatos db = new BaseDatos();

        Usuario usuario = new Usuario();
        usuario.solicitarDNI();

        if (!db.autenticarUsuario(usuario.getDni())) {
            System.out.println("Usuario no registrado. Registrando...");
            db.registrarUsuario(usuario.getDni());
        }

        // Obtener el saldo del usuario desde la base de datos
        double saldoInicial = db.obtenerSaldo(usuario.getDni());

        Ingreso ingreso = new Ingreso();
        Gasto gasto = new Gasto(saldoInicial, db);

        while (true) {
            System.out.println("¿Qué desea realizar? (1: Ingreso, 2: Gasto, 0: Salir):");
            int opcion = validarOpcion(0, 2);

            if (opcion == 0) {
                break;
            } else if (opcion == 1) {
                ingreso.agregarIngreso();
                gasto = new Gasto(ingreso.getSaldo(), db); // Reasignar el saldo actualizado
                System.out.println("Saldo actual: " + ingreso.getSaldo());
            } else if (opcion == 2) {
                gasto.agregarGasto(usuario.getDni());
            }
        }

        scanner.close();
    }

    public static int validarOpcion(int min, int max) {
        int opcion;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Opción no válida. Por favor, introduzca un número entre " + min + " y " + max + ":");
        }
    }
}
