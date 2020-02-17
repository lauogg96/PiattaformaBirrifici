package Test2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Model.Acquirente;
import Model.AcquirenteDAO;

public class AcquirenteDAOTest {

	private AcquirenteDAO acquirente;

@Before
	public void setUp() throws Exception {
		acquirente=new AcquirenteDAO();
	}

@Test
	public void testRegistra(){
		boolean registrazione=acquirente.RegistrazioneAcquirente("email@email.com","02020202","Mario","Rossi","Via via, 90", "0232596547");
		assertEquals(true,registrazione);
	}

@Test
	public void testRegistra1(){
		boolean registrazione=acquirente.RegistrazioneAcquirente("email@email.com","02020202","Mario","Rossi","Via via, 90", "0232596547");
		assertNotEquals(true,registrazione);
	}
	
@Test
	public void testModifica(){
		boolean modifica=acquirente.ModificaDati("3410205228","02020202","Via via, 90", "email@email.com");
		assertEquals(true,modifica);
	}
	

@Test
	public void test() {
		ArrayList<Acquirente>ac=acquirente.ListAcquirenti();
		assertNotEquals(0, ac);
	}


	





}
