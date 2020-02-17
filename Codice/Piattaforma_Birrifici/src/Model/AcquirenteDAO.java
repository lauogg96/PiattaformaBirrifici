package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Control.DBConnector;

public class AcquirenteDAO {

	private static final String CREATE_QUERY = "INSERT INTO acquirente (email, password, nome, cognome, indirizzo, numTelefono) VALUES (?,?,?,?,?,?)";
	private static final String UPDATE_QUERY = "UPDATE acquirente SET numTelefono=?,password=?,indirizzo=? where email=?";

	
	Connection conn;
	PreparedStatement statement;
	PreparedStatement statement2;
	ResultSet rs;
	
	public AcquirenteDAO() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}
	
	public boolean RegistrazioneAcquirente(String email, String password, String nome, String cognome,String indirizzo, String numTelefono) {
		try {
			conn=DBConnector.createConnection();
				statement2=conn.prepareStatement(CREATE_QUERY);
				statement2.setString(1, email);
				statement2.setString(2, password);
				statement2.setString(3,nome);
				statement2.setString(4, cognome);
				statement2.setString(5, indirizzo);
				statement2.setString(6, numTelefono);
				statement2.executeUpdate();
					return true;
//}
			
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean ModificaDati(String tel, String password, String indirizzo, String email) {
		try {
			conn=DBConnector.createConnection();
				statement2=conn.prepareStatement(UPDATE_QUERY);
				statement2.setString(1, tel);
				statement2.setString(2, password);
				statement2.setString(3, indirizzo);
				statement2.setString(4, email);
				statement2.executeUpdate();
				return true;
				
			}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private Acquirente convertRowToAcquirente(ResultSet rs) throws SQLException {
		
		String email = rs.getString("email");
		String password = rs.getString("password");
		String nome = rs.getString("nome");
		String cognome = rs.getString("cognome");
		String indirizzo = rs.getString("indirizzo");
		String numTelefono = rs.getString("numTelefono");		
		Acquirente acquirente = new Acquirente(email, password,nome,cognome,indirizzo,numTelefono);
		return acquirente;
	}
	
	public ArrayList<Acquirente> ListAcquirenti() {
		ArrayList<Acquirente> lista= new ArrayList<Acquirente>();
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement("SELECT * FROM acquirente");
			rs=statement.executeQuery();
			while(rs.next()) {
				lista.add(convertRowToAcquirente(rs));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
