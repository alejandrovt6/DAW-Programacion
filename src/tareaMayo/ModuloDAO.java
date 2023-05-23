package tareaMayo;

import java.sql.*;
import tareaMayo.Modulo;

public class ModuloDAO {
	
	// Atributos
    private ConexionBD conexionBD;

    // Constructor
    public ModuloDAO() {
        conexionBD = new ConexionBD("jdbc:mysql://localhost:3306/bd_mismodulos", "root", "");
    }

    // Parámetros
    Connection connection = null;
    PreparedStatement pstmt = null;
    
    // Métodos
    // Valida y comprueba si el objeto connection es distinto a null, si es así, se cierra
    private void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
        }       
    }
    
    // Mísma implementación con el objeto prepareStatement
    private void close(PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
            	preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }
    
    
    public void insertarModulo(Modulo modulo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
        	// Obtiene una conexión
            conn = conexionBD.getConnection();
            // Define una consulta SQL
            String query = "INSERT INTO Modulos (nomModulo, numHoras, nomProfe, numUnit, notaFinal) VALUES (?, ?, ?, ?, ?)";
            // Prepara la consulta SQL  
            pstmt = conn.prepareStatement(query);
            // Asigna valores a los parámetros consultados mediante los métodos setXXX()
 //           pstmt.setInt(1, modulo.getIdModulo());
            pstmt.setString(1, modulo.getNomModulo());
            pstmt.setInt(2, modulo.getNumHoras());
            pstmt.setString(3, modulo.getNomProfe());
            pstmt.setInt(4, modulo.getnumUnit());
            pstmt.setInt(5, modulo.getNotaFinal());
            
            // Ejecuta la consulta SQL y que devuelve un valor entero que indica el número de filas afectadas
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa.");
            } else {
                System.out.println("No se ha insertado ninguna fila.");
            }

          // Controlar excepción SQLException
        } catch (SQLException e) {
            e.printStackTrace();  
          //  Cierra la conexión y el objeto PreparedStatement
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
           }
        }
    }
    
    public void eliminarModulo(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = conexionBD.getConnection();
            // Query para eliminar registro
            String query = "DELETE FROM Modulos WHERE idModulo = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            int rowCount = pstmt.executeUpdate();
            // Si es mayor que 0, opoeración exitosa
            if (rowCount > 0) {
                System.out.println("El módulo ha sido eliminado exitosamente.");
            } else {
                System.out.println("No se ha encontrado el módulo con el id especificado.");
            }
            // Controlar excepciones y cerrar objetos pstmt y connection
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

