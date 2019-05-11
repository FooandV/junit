package co.curso.junit.aserciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	// parametros de conexion
	private final String db = "bdGenerica";
	private final String url = "jdbc:mysql://localchost/" + db + "?";
	private final String user = "admin";
	private final String pass = "admin";

//	private final String db; //"bdGenerica"
//	private final String url; //"jdbc:mysql://localchost/" + db + "?";
//	private final String user; // "admin";
//	private final String pass; // "admin";

	public Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(this.url + "user" + this.user + "&password=" + this.pass);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}

}
