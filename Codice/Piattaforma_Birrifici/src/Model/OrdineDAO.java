
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Control.DBConnector;
import Model.Ordine;

public class OrdineDAO {

private static final String QUERY="Insert into ordine VALUES( ?, ?,?, ?, ?, ?, ?, ?, ?)";
private static final String QUERY_STATO="UPDATE ordine SET stato=? where cod_ordine=?";
    private Connection conn;
    PreparedStatement statement=null;
    public OrdineDAO() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }


    public ArrayList <Ordine> dammiOrdine() throws Exception
    {
        ArrayList<Ordine> lista = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try{
        	conn=DBConnector.createConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery("Select * from ordine");

            while (rs.next()){
                Ordine ordine = convertRowToOrdine(rs);
                lista.add(ordine);
            }
            return lista;
        }
        finally{}
    }
public boolean aggiornaStato(String stato,String cod)throws Exception
{
     try{
     	conn=DBConnector.createConnection();
        statement=conn.prepareStatement(QUERY_STATO);
        statement.setString(1, stato);
        statement.setString(2, cod);
        statement.execute();
        return true;
}
     finally {}

}

    private Ordine convertRowToOrdine(ResultSet rs) throws SQLException {
        
        String cod_ordine = rs.getString("cod_ordine");
        String acq_or = rs.getString("acquirenteOr");
        String prodotto_or = rs.getString("prodottoOr");
        int quantita = rs.getInt("quantita");
        double prezzo = rs.getDouble("prezzo");
        int gg = rs.getInt("gg");
        int mm = rs.getInt("mm");
        int aaaa = rs.getInt("aaaa");
        String stato=rs.getString("stato");

        Ordine ordine = new Ordine(cod_ordine, acq_or, prodotto_or, quantita, prezzo, gg, mm, aaaa,stato);
        return ordine;
    }
    
    public boolean inserisciOrdine(Ordine or) throws SQLException
    {
    	conn=DBConnector.createConnection();
        PreparedStatement pstm= conn.prepareStatement(QUERY);
        pstm.setString(1, or.getCod_ordine());
        pstm.setString(2, or.getAcquirenteOr());
        pstm.setString(3, or.getProdottoOr());
        pstm.setInt(4, or.getQuantita());
        pstm.setDouble(5, or.getPrezzo());
        pstm.setInt(6, or.getGg());
        pstm.setInt(7, or.getMm());
        pstm.setInt(8, or.getAaaa());
        pstm.setString(9, or.getStato());
        pstm.executeUpdate();
        pstm.close();
        return true;
    }

}
