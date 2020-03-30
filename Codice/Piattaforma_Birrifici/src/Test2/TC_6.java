package Test2;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
    import org.junit.Test;
    import org.mockito.Mockito;
    import org.springframework.mock.web.MockHttpServletRequest;
    import org.springframework.mock.web.MockHttpServletResponse;

import Control.*;



    public class TC_6 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private ModificaProdotto mp= Mockito.mock(ModificaProdotto.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
     
     @Test
     public void TC6_1() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("0");
         when(request.getParameter("prezzo")).thenReturn("5");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
    
     @Test
     public void TC6_2() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("0");
         when(request.getParameter("prezzo")).thenReturn("5");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC6_3() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("3");
         when(request.getParameter("prezzo")).thenReturn("0");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC6_4() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("3");
         when(request.getParameter("prezzo")).thenReturn("0");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC6_5() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("3");
         when(request.getParameter("prezzo")).thenReturn("5");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC6_6() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica+-+-++++-__-");
         when(request.getParameter("qua")).thenReturn("3");
         when(request.getParameter("prezzo")).thenReturn("5");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC6_7() throws ServletException, IOException  {
    	 mp = new ModificaProdotto(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("descrizione")).thenReturn("corposa e aromatica");
         when(request.getParameter("qua")).thenReturn("3");
         when(request.getParameter("prezzo")).thenReturn("5");

         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         when(request.getSession().getAttribute("nome")).thenReturn("Weiss");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         mp.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
    }