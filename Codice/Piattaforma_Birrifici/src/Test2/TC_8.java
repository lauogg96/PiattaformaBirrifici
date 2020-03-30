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



    public class TC_8 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private Cerca cr= Mockito.mock(Cerca.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
     
     @Test
     public void TC8_1() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("acquirente")).thenReturn("atlandi@gmail.it");
    	 when(request.getParameter("prodotto")).thenReturn("Weiss");
    	 when(request.getParameter("quantita")).thenReturn("0");
    	 when(request.getParameter("prezzo")).thenReturn("0");
    	 
    	 
    	 
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("atlandi@gmail.it");

         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }

     @Test
     public void TC8_2() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("acquirente")).thenReturn("atlandi@gmail.it");
    	 when(request.getParameter("prodotto")).thenReturn("Weiss");
    	 when(request.getParameter("quantita")).thenReturn("10");
    	 when(request.getParameter("prezzo")).thenReturn("5");
    	 
    	 
    	 
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("atlandi@gmail.it");

         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC8_3() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("acquirente")).thenReturn("atlandi@gmail.it");
    	 when(request.getParameter("prodotto")).thenReturn("Weiss");
    	 when(request.getParameter("quantita")).thenReturn("1");
    	 when(request.getParameter("prezzo")).thenReturn("5");
    	 
    	 
    	 
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("atlandi@gmail.it");

         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }

    }