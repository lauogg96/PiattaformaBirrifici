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



    public class TC_4 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private LoginVenditore login= Mockito.mock(LoginVenditore.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
     
     @Test
     public void TC4_1() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC4_2() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("20520");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC4_3() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("202020202020");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC4_4() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("1_2_2_5_2_!");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC4_5() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("12352058797");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC4_6() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("03903700650");
         when(request.getParameter("password")).thenReturn("123456");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC4_7() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("03903700650");
         when(request.getParameter("password")).thenReturn("1234567+_");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC4_8() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("03903700650");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC4_9() throws ServletException, IOException  {
    	 login = new LoginVenditore(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("pi")).thenReturn("03903700650");
         when(request.getParameter("password")).thenReturn("04061995");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
     
    }