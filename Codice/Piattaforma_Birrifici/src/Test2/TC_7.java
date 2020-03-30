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



    public class TC_7 extends Mockito{
    	
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
     public void TC7_1() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("Paulaner Paulaner Paulaner Paulaner Paulaner Paulaner Paulaner Paulaner");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
   
     @Test
     public void TC7_2() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("Paulaner +-+-+-");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC7_3() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("Paulaner");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
     @Test
     public void TC7_4() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn(null);
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC7_5() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("bionda bionda bionda bionda bionda bionda bionda bionda");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC7_6() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("bionda +-;_");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC7_7() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("bionda");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
     @Test
     public void TC7_8() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("5206412");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC7_9() throws ServletException, IOException  {
    	 cr = new Cerca(); 
    	 when(request.getSession()).thenReturn(session);

    	 when(request.getParameter("cerca")).thenReturn("12345678920");
      
         when(request.getSession()).thenReturn(session);

         when(request.getSession().getAttribute("email")).thenReturn("");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         cr.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
    }