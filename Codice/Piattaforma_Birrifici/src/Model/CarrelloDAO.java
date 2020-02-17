
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Control.DBConnector;
import Model.Carrello;

public class CarrelloDAO {

private static final String QUERY="Insert into carrello VALUES( ?, ?, ?, ?)";
private static final String QUERYELIMINA="delete  from carrello where acquirente=? and prodotto=?";
private static final String QUERYAGGIORNA="update  carrello set quantita=?, totale=? where prodotto=? and acquirente=?";

    private Connection conn;
    public CarrelloDAO() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }


    public ArrayList <Carrello> dammiCarrello() throws Exception
    {
        ArrayList<Carrello> lista = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try{
        	conn=DBConnector.createConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery("Select * from carrello");

            while (rs.next()){
                Carrello carrello = convertRowToCarrello(rs);
                lista.add(carrello);
            }
            return lista;
        }
        finally{}
    }
    

    private Carrello convertRowToCarrello(ResultSet rs) throws SQLException {
        
        String acq = rs.getString("acquirente");
        String prod = rs.getString("prodotto");
        int quant = rs.getInt("quantita");
        double totale = rs.getDouble("totale");

        Carrello carrello = new Carrello(acq, prod, quant, totale);
        return carrello;
    }
    
    public boolean inserisciCarrello(Carrello ca) throws SQLException
    {
    	conn=DBConnector.createConnection();
        PreparedStatement pstm= conn.prepareStatement(QUERY);
        pstm.setString(1, ca.getAcquirente());
        pstm.setString(2, ca.getProdotto());
        pstm.setInt(3, ca.getQuantita());
        pstm.setDouble(4, ca.getTotale());
        pstm.executeUpdate();
        pstm.close();
        return true;
    }

    public boolean eliminaCarrello(String au, String cd) throws SQLException
    {
    	conn=DBConnector.createConnection();
        PreparedStatement pstm= conn.prepareStatement(QUERYELIMINA);
        pstm.setString(1, au);
        pstm.setString(2, cd);
        
        pstm.executeUpdate();
        pstm.close();
        return true;
    }

    public boolean aggiornaCarrello(int q, double tot, String cod, String user) throws SQLException
    {
    	conn=DBConnector.createConnection();
        PreparedStatement pstm= conn.prepareStatement(QUERYAGGIORNA);
        pstm.setInt(1, q);
        pstm.setDouble(2, tot);
        pstm.setString(3, cod);
        pstm.setString(4, user);
        pstm.executeUpdate();
        pstm.close();
        return true;
    }
}
