package org.example;

public class Usuario {
    private String dni;

    public String getDni() {
        return dni;
    }

    public void solicitarDNI() {
        System.out.println("Introduzca su DNI (formato: 8 dígitos seguidos de una letra):");
        while (true) {
            String input = Main.scanner.nextLine();
            if (input.matches("\\d{8}[A-Za-z]")) {
                this.dni = input;
                break;
            } else {
                System.out.println("DNI no válido. Por favor, introduzca un DNI válido (formato: 12345678A):");
            }
        }
    }
}
