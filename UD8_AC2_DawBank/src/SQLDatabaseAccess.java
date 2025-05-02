import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLDatabaseAccess {
    public static int insertarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente(nombre, dni, fecha_nacimiento, telefono, email, direccion) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = SQLDatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getDni());
                ps.setDate(3, Date.valueOf(cliente.getFechaNacimiento()));
                ps.setString(4, cliente.getTelefono());
                ps.setString(5, cliente.getEmail());
                ps.setString(6, cliente.getDireccion());
                ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
                
                else throw new SQLException("No se pudo obtener el ID del cliente");
            }
        }
    }

    public static void insertarCuenta(CuentaBancaria cuenta) throws SQLException {
        String sql = "INSERT INTO cuenta(iban, cliente_id, saldo) VALUES (?, ?, ?)";
        
        try (Connection conn = SQLDatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
                ps.setString(1, cuenta.getIban());
                ps.setInt(2, cuenta.getCliente().getId());
                ps.setDouble(3, cuenta.getSaldo());
                ps.executeUpdate();
        }
    }

    public static void insertarMovimiento(String iban, Movimiento movimiento) throws SQLException {
        String sql = "INSERT INTO movimiento(cuenta_iban, tipo, cantidad, fecha) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = SQLDatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, iban);
                ps.setString(2, movimiento.getTipo());
                ps.setDouble(3, movimiento.getCantidad());
                ps.setTimestamp(4, Timestamp.valueOf(movimiento.getFecha()));
                ps.executeUpdate();
        }
    }

    public static List<Movimiento> listarMovimientos(String iban) throws SQLException {
        String sql = "SELECT tipo, cantidad, fecha FROM movimiento WHERE cuenta_iban = ? ORDER BY fecha";
        List<Movimiento> list = new ArrayList<>();
        
        try (Connection conn = SQLDatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, iban);
            
                try (ResultSet rs = ps.executeQuery()) {
                    
                    while (rs.next()) {
                        list.add(new Movimiento(
                            rs.getString("tipo"),
                            rs.getDouble("cantidad"),
                            rs.getTimestamp("fecha").toLocalDateTime()
                        ));
                    }
                }
            }
        return list;
    }
}