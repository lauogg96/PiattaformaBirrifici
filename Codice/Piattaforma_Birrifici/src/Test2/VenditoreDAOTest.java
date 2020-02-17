package Test2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import Model.VenditoreDAO;
import Model.Venditore;

public class VenditoreDAOTest {

	private VenditoreDAO venditore;
	
@Before
	public void setUp() throws Exception {
		venditore=new VenditoreDAO();
	}

@Test
	public void testRegistra(){
		boolean registra=venditore.RegistrazioneVenditore("95862314759","02020202","venditore@birrificio.com","VenditoreBirrificio", "Via delle vie");
		assertEquals(true,registra);
	}

@Test
	public void testRegistra1(){
		boolean registra=venditore.RegistrazioneVenditore("95862314759","02020202","venditore@birrificio.com","VenditoreBirrificio", "Via delle vie");
		assertEquals(false,registra);
	}

@Test
	public void testLista(){
		ArrayList<Venditore> lista=venditore.ListVenditori();
		assertNotEquals(0,lista);
	}

}