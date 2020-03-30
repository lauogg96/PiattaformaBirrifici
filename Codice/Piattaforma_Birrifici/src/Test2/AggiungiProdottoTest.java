package Test2;



import java.io.IOException;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import junit.framework.TestCase;

import Control.AggiungiProdotto;
import Control.LoginVenditore;

public class AggiungiProdottoTest extends TestCase{
	private AggiungiProdotto creaProdotto;
	//private MockHttpServletRequest request; 
//	private MockHttpServletResponse response;
	private LoginVenditore servletLogin;
	
	MockHttpServletRequest request;
	
	MockHttpServletResponse response;
	
	@Before
	public void setUp() {
		//creaProdotto = new AggiungiProdotto();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		//servletLogin=new LoginVenditore();
		//MockitoAnnotations.initMocks(this);
	}
	
//Caso nome non inserito
	@Test
	public void test() throws Exception{
	
	
	//when(request.getParameter("pi")).thenReturn("8208520852");
	//when(request.getParameter("password")).thenReturn("04061995");
	
	assertTrue(true);
		//servletLogin.doPost(request, response);
	//	String risposta= request.getParameter("risposta");
	//	String risposta=(String)request.getAttribute("risposta");
		//assertEquals(false,risposta);
	}



 }