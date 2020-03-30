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



    public class TC_5 extends Mockito{
    	
    	HttpSession session = mock(HttpSession.class);
        private AggiungiProdotto ap= Mockito.mock(AggiungiProdotto.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

      /**
       * Before.
       */
      @Before
      public void setUp() {
        
      }
     
     @Test
     public void TC5_1() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn(null);
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
    
     
     @Test
     public void TC5_2() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss Weiss Weiss Weiss weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC5_3() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("-Weiss+");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     
     @Test
     public void TC5_4() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss3");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_5() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_6() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("BiondaBiondaBiondaBionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_7() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda+-_");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_8() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("0");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_9() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("102");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_10() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("0");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_11() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. Rinfrescante e fruttata. ");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_12() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante e+ fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_13() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("0");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_14() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("0");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_15() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("0");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_16() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("0");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_17() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn(null);
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");

         
         when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("false"));
      }
     @Test
     public void TC5_18() throws ServletException, IOException  {
    	 ap = new AggiungiProdotto(); 
    	 when(request.getSession()).thenReturn(session);
         when(request.getParameter("nome")).thenReturn("Weiss");
         when(request.getParameter("colore")).thenReturn("Bionda");
         when(request.getParameter("gradazione")).thenReturn("7");
         when(request.getParameter("descrizione")).thenReturn("rinfrescante fruttata");
         when(request.getParameter("quantitaAgg")).thenReturn("5");
         when(request.getParameter("prezzo")).thenReturn("6");
     when(request.getSession()).thenReturn(session);
         when(request.getSession().getAttribute("pi")).thenReturn("12345678912");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         ap.doPost(request, response);
         writer.flush(); 
         assertTrue(stringWriter.toString().contains("true"));
      }
    }