package Test2;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Model.Carrello;
import Model.CarrelloDAO;

public class CarrelloDAOTest {

	private CarrelloDAO carello;

@Before
	public void setUp() throws Exception {
	carello=new CarrelloDAO();
	}
	
@Test 
	public void testListCarrello() throws Exception{
		ArrayList<Carrello> ca= carello.dammiCarrello();
		assertNotEquals(0,ca);
	}

@Test 
	public void testInserisci() throws SQLException{
		Carrello ca= new Carrello("email@email.com","birra1",1,22);
		boolean inserisci=carello.inserisciCarrello(ca);
		assertEquals(true,inserisci);
	}

@Test
	public void testAggiorna() throws SQLException{
		boolean aggiorna=carello.aggiornaCarrello(2,44.0,"birra1","email@email.com");
		assertEquals(true,aggiorna);
	}

@Test
	public void testElimina() throws SQLException{
		boolean elimina=carello.eliminaCarrello("email@email.com","birra1");
		assertEquals(true,elimina);
	}

}