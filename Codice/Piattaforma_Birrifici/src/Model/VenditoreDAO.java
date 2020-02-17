package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Control.DBConnector;

public class VenditoreDAO {

	private static final String CREATE_QUERY = "INSERT INTO venditore (pi, password, email, ragioneSociale, indirizzo) VALUES (?,?,?,?,?)";
	private static final String UPDATE_QUERY = "UPDATE venditore SET email=?,password=?,indirizzo=?";
	private static final String CERCA_QUERY = "SELECT COUNT * AS tmp1 FROM venditore WHERE pi=?";
	
	Connection conn=null;
	PreparedStatement statement=null;
	PreparedStatement statement2=null;
	ResultSet rs;
	
	public VenditoreDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}
	
	public boolean RegistrazioneVenditore(String pi, String password, String email, String ragioneSociale, String indirizzo) {
		try {
			conn=DBConnector.createConnection();
		/*	statement=conn.prepareStatement(CERCA_QUERY);
			statement.setString(1,vr.pi);
			rs=statement.executeQuery();
			rs.next();
			int tmp=rs.getInt("tmp1");
			if(tmp==0) {*/
				statement2=conn.prepareStatement(CREATE_QUERY);
				statement2.setString(1, pi);
				statement2.setString(2, password);
				statement2.setString(3, email);
				statement2.setString(4, ragioneSociale);
				statement2.setString(5, indirizzo);
				//statement2.executeQuery();
				statement2.executeUpdate();
				return true;

			//}
			
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean ModificaDati(String email, String password, String indirizzo) {
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(CERCA_QUERY);
			statement.setString(1,email);
			rs=statement.executeQuery();
			rs.next();
			int tmp=rs.getInt("tmp1");
			if(tmp==0) {
				statement2=conn.prepareStatement(UPDATE_QUERY);
				statement2.setString(1, email);
				statement2.setString(2, password);
				statement2.setString(3, indirizzo);
				statement2.executeQuery();
			
				}	return true;
			}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private Venditore convertRowToVenditore(ResultSet rs) throws SQLException {
		
		String pi = rs.getString("pi");
		String password = rs.getString("password");
		String email = rs.getString("email");
		String ragioneSociale = rs.getString("ragioneSociale");
		String indirizzo = rs.getString("indirizzo");		
		Venditore venditore = new Venditore(pi, password,email,ragioneSociale,indirizzo);
		return venditore;
	}

	public ArrayList<Venditore> ListVenditori() {
		ArrayList<Venditore> lista= new ArrayList<Venditore>();
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement("SELECT * FROM VENDITORE");
			rs=statement.executeQuery();
			while(rs.next()) {
				lista.add(convertRowToVenditore(rs));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}

