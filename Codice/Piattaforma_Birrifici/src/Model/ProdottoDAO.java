package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Control.DBConnector;

public class ProdottoDAO {

	private static final String CREATE_QUERY = "INSERT INTO prodotto (nome, venditore, colore, gradazione, descrizione,quantita,prezzo,foto) VALUES (?,?,?,?,?,?,?,?)";
	private static final String UPDATE_QUERY = "UPDATE prodotto SET descrizione=?,quantita=?,prezzo=?  where nome=?";
	private static final String ELIMINA_QUERY = "DELETE FROM prodotto WHERE nome=?";
	private static final String RICERCA_QUERY = "SELECT * FROM prodotto WHERE nome=? OR colore=? OR venditore=?";
	private static final String VEDI_QUERY ="SELECT * FROM prodotto WHERE birrificio=?";
	private static final String AGGIORNA_QUANTITA="UPDATE prodotto SET quantita=? where nome=?";
	
	Connection conn=null;
	PreparedStatement statement=null;
	PreparedStatement statement2=null;
	ResultSet rs;
	
	public ProdottoDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}
	
	public boolean aggiornaQuantita(String nome,int quantita) {
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(AGGIORNA_QUANTITA);
			statement.setInt(1, quantita);
			statement.setString(2,nome);
			statement.executeUpdate();
			return true;
		}catch(SQLException e ) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean inserisciProdotto(String nome, String pi, String colore, double gradazione,String descrizione, int quantita, double prezzo,String foto) {
		try {
		conn=DBConnector.createConnection();

			statement2=conn.prepareStatement(CREATE_QUERY);
			statement2.setString(1, nome);
			statement2.setString(2, pi);
			statement2.setString(3, colore);
			statement2.setDouble(4, gradazione);
			statement2.setString(5, descrizione);
			statement2.setInt(6, quantita);
			statement2.setDouble(7, prezzo);
			statement2.setString(8, foto);

			statement2.execute();
			return true;
//}
	
}catch(SQLException e){
	e.printStackTrace();
	return false;
}
	}
	
	public boolean modificaProdotto(String nome,String descrizione, double prezzo, int quantita) {
		try{
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(UPDATE_QUERY);
			statement.setString(1, descrizione);
			statement.setDouble(2,prezzo);
			statement.setInt(3, quantita);
			statement.setString(4,nome);
			statement.execute();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean eliminaProdotto(String nome) {
		try{
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(ELIMINA_QUERY);
			statement.setString(1,nome);
			statement.execute();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private Prodotto convertRowToProdotto(ResultSet rs) throws SQLException {
		String nome=rs.getString("nome");
		String venditore=rs.getString("venditore");
		String colore=rs.getString("colore");
		double gradazione=rs.getDouble("gradazione");
		String descrizione=rs.getString("descrizione");
		int quantita=rs.getInt("quantita");
		double prezzo=rs.getDouble("prezzo");
		String foto=rs.getString("foto");
		Prodotto p=new Prodotto(nome,venditore,colore,gradazione,descrizione,quantita,prezzo,foto);
		return p;
	}
	
	
	
	
	public ArrayList<Prodotto> dammiProdotti(String n){
		ArrayList<Prodotto> p=new ArrayList<Prodotto>();
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(RICERCA_QUERY);
			statement.setString(1,n);
			statement.setString(2,n);
			statement.setString(3,n);
			rs=statement.executeQuery();
			while(rs.next()) {
				p.add(convertRowToProdotto(rs));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return p;
	}
	
	public ArrayList<Prodotto> VisualizzaProdotti(String birrificio){
		ArrayList<Prodotto> p=new ArrayList<Prodotto>();
		try {
			conn=DBConnector.createConnection();
			statement=conn.prepareStatement(VEDI_QUERY);
			statement.setString(1,birrificio);
			rs=statement.executeQuery();
			while(rs.next()) {
				p.add(convertRowToProdotto(rs));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}
}
