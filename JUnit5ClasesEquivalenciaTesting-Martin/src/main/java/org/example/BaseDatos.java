package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDatos {
    private static final String DB_URL = "jdbc:sqlite:finanzas.db";

    public BaseDatos() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String createTable = "CREATE TABLE IF NOT EXISTS usuarios (dni TEXT PRIMARY KEY, saldo REAL DEFAULT 0.0)";
            conn.createStatement().execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean autenticarUsuario(String dni) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM usuarios WHERE dni = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void registrarUsuario(String dni) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String insert = "INSERT INTO usuarios (dni, saldo) VALUES (?, 0.0)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, dni);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double obtenerSaldo(String dni) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT saldo FROM usuarios WHERE dni = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("saldo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0; // Si no se encuentra el usuario, devolvemos 0.
    }

    public void actualizarSaldo(String dni, double nuevoSaldo) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String update = "UPDATE usuarios SET saldo = ? WHERE dni = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setDouble(1, nuevoSaldo);
            ps.setString(2, dni);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
