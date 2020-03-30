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



    public class TC_2 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private RegistrazioneVenditore rv= Mockito.mock(RegistrazioneVenditore.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
    
     
     @Test
     public void TC2_1() throws ServletException, IOException  {
    	 rv = new RegistrazioneVenditore(); 
    	
    	 when(request.getSession()).thenReturn(session);
    	 when(request.getParameter("pi")).thenReturn("");
    	 when(request.getParameter("rs")).thenReturn("Bigsansu");
         when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
         when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
         when(request.getParameter("pass")).thenReturn("12345678");
         
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         rv.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));

	}
 
      @Test
      public void TC2_2() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_3() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("03254896258695");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_4() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("ab032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_5() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("03214583694");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_6() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_7() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("B_igs_ansu+");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_8() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_9() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.infogmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_10() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_11() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54 via crisoli 54 via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_12() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via + .crisoli - + 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_13() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("032548962");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      @Test
      public void TC2_14() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("03254896220");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678_:+!");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));

 	}

      
      @Test
      public void TC2_15() throws ServletException, IOException  {
     	 rv = new RegistrazioneVenditore(); 
     	
     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("pi")).thenReturn("12345678902");
     	 when(request.getParameter("rs")).thenReturn("Bigsansu");
          when(request.getParameter("email")).thenReturn("bigsansu.info@gmail.com");
          when(request.getParameter("indirizzo")).thenReturn("via crisoli 54");
          when(request.getParameter("pass")).thenReturn("12345678");
          
          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          rv.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("true"));

 	}
}