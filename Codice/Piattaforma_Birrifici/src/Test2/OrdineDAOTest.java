package Test2;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import Model.Ordine;
import Model.OrdineDAO;
import java.util.UUID;

public class OrdineDAOTest {

	private OrdineDAO ordine;
	private String id;
@Before
	public void setUp() throws Exception {
		ordine=new OrdineDAO();
		id = UUID.randomUUID().toString();
	}

@Test
	public void testInserisci() throws SQLException {
		Ordine or=new Ordine(id,"email@email.com","birra1",2,44.0,8,02,2020,"In Elaborazione");
		boolean inserisc=ordine.inserisciOrdine(or);
		assertEquals(true,inserisc);	
		}


@Test
	public void testAggiorna() throws Exception{
		boolean aggiorna=ordine.aggiornaStato("In Consegna",id);
		assertEquals(true,aggiorna);	
		}

@Test
	public void testLista() throws Exception{
		ArrayList<Ordine> lista=ordine.dammiOrdine();
		assertNotEquals(0,lista);
	}
}