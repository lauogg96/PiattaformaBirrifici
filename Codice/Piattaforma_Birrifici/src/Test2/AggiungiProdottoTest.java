package Test2;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


import Control.AggiungiProdotto;
import Control.LoginVenditore;

public class AggiungiProdottoTest extends Mockito{
	private AggiungiProdotto creaProdotto;
	private MockHttpServletRequest request; 
	private MockHttpServletResponse response;
	private LoginVenditore servletLogin;
	
@Before
	public void setUp() {
		creaProdotto = new AggiungiProdotto();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		servletLogin=new LoginVenditore();
	}
	
//Caso nome non inserito
@Test
	public void TC5_1() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso nome lungo
@Test
	public void TC5_2() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","WeissWeissWeissWeissWeiss");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso nome non rispetta il formato
@Test
	public void TC5_3() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","Weiss+-");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso nome esiste già nel DB
@Test
	public void TC5_4() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso colore non inserito
@Test
	public void TC5_5() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso colore non inserito
@Test
	public void TC5_6() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","BiondaBiondaBiondaBionda");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso colore non rispetta il formato
@Test
	public void TC5_7() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda+-_");
		request.addParameter("gradazione", "7");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso gradazione non inserita
@Test
	public void TC5_8() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso gradazione troppo alta
@Test
	public void TC5_9() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "102");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso descrizione lunga
@Test
	public void TC5_11() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. ");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso descrizione non rispetta il formato
@Test
	public void TC5_12() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante_e+ fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso quantita non inserita
@Test
	public void TC5_13() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso quantita non inserita
@Test
	public void TC5_14() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "0");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}
	
//Caso prezzo non inserito
@Test
	public void TC5_15() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "0");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(false,risposta);
	}

//OK
@Test
	public void TC5_17() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(true,risposta);
	}
	
//OK
@Test
	public void TC5_18() throws ServletException, IOException{
		request.addParameter("pi","8208520852");
		request.addParameter("password", "04061995"); 
		servletLogin.doPost(request, response);
		request.addParameter("nome","birra");
		request.addParameter("pi", "12345678");
		request.addParameter("colore","Bionda");
		request.addParameter("gradazione", "10");
		request.addParameter("descrizione","Rinfrescante e fruttata.");
		request.addParameter("quantita", "5");
		request.addParameter("prezzo", "6.5");
		creaProdotto.doPost(request,response);
		boolean risposta=(boolean)request.getAttribute("risposta");
		assertEquals(true,risposta);
	}
 }