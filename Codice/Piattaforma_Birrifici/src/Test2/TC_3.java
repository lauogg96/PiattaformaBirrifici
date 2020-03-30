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



    public class TC_3 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private LoginAcquirente login= Mockito.mock(LoginAcquirente.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
     
     @Test
     public void TC3_1() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC3_2() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandigmail.com");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC3_3() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandi1@gmail.com");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC3_4() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandi@gmail.com");
         when(request.getParameter("password")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC3_5() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandi1@gmail.com");
         when(request.getParameter("password")).thenReturn("123456781251525820");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC3_6() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandi1@gmail.com");
         when(request.getParameter("password")).thenReturn("12345677");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC3_7() throws ServletException, IOException  {
    	 login = new LoginAcquirente(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("emailAc")).thenReturn("atlandi@gmail.it");
         when(request.getParameter("password")).thenReturn("12345678");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         login.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
    }