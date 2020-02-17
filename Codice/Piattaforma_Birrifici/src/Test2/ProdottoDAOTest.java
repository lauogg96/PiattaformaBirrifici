package Test2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import Model.ProdottoDAO;
import Model.Prodotto;

public class ProdottoDAOTest {

	private ProdottoDAO prodotto;

@Before
	public void setUp() throws Exception {
		prodotto=new ProdottoDAO();
	}
	
@Test
	public void testInserisci1(){
		boolean inserisci=prodotto.inserisciProdotto("birra1","95862314759","scura",12,"Corposa ed aromatizzata",15,5,"");
		assertEquals(true,inserisci);	
		}

@Test
public void testInserisci(){
	boolean inserisci=prodotto.inserisciProdotto("birra1","95862314759","scura",12,"Corposa ed aromatizzata",15,5,"");
	assertNotEquals(true,inserisci);	
	}


@Test
	public void testModifica(){
		boolean modifica=prodotto.modificaProdotto("birra1","Corposa ed elegante al palato",5.60,20);
		assertEquals(true,modifica);
	}
	
@Test
	public void testListaNome(){
		ArrayList<Prodotto> lista=prodotto.dammiProdotti("birra1");
		assertNotEquals(0,lista);
	}

	
@Test
	public void testListaBirrificio(){
		ArrayList<Prodotto> lista=prodotto.dammiProdotti("8208520852");
		assertNotEquals(0,lista);
	}	
	

	
@Test
	public void testElimina(){
		boolean elimina=prodotto.eliminaProdotto("birra1");
		assertEquals(true,elimina);
	}
	

}