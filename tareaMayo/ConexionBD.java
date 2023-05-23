package tareaMayo;

import java.sql.*;

public class ConexionBD {
	
	// Atributos
	private String jdbcUrl;
	private String user;
	private String password;
	
	// Constructor de 3 parámetros
	public ConexionBD(String jdbcUrl, String user, String password ) {
		this.jdbcUrl = jdbcUrl;
		this.user = user;
		this.password = password;
	}
	
	// Devuelve conexión a la BBDD
	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
		return connection;
	}
}
