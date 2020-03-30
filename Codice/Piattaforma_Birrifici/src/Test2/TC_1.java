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


public class TC_1 extends Mockito{

	HttpSession session = mock(HttpSession.class);
	private RegistrazioneAcquirente ra= Mockito.mock(RegistrazioneAcquirente.class);
	HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
	HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

	/**
	 * Before.
	 */
	 @Before
	 public void setUp() {

	 }

	 @Test
	 public void TC1_1() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		// when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("a@p");
		 when(request.getParameter("p")).thenReturn("12345678");
		 when(request.getParameter("n")).thenReturn("Antonio");
		 when(request.getParameter("c")).thenReturn("Landi");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("3335209765");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

	 
      @Test
      public void TC1_2() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("ap.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

	 @Test
	 public void TC1_3() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		 when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
		 when(request.getParameter("p")).thenReturn("12345678");
		 when(request.getParameter("n")).thenReturn("Antonio");
		 when(request.getParameter("c")).thenReturn("Landi");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("3335209765");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

	 @Test
	 public void TC1_4() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		 when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
		 when(request.getParameter("p")).thenReturn("1234567");
		 when(request.getParameter("n")).thenReturn("Antonio");
		 when(request.getParameter("c")).thenReturn("Landi");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("3335209765");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

     @Test
      public void TC1_5() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("1234567+");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

	 @Test
	 public void TC1_6() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		 when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
		 when(request.getParameter("p")).thenReturn("12345678");
		 when(request.getParameter("n")).thenReturn("");
		 when(request.getParameter("c")).thenReturn("Landi");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("3335209765");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

    @Test
      public void TC1_7() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("AntonioAntonioAntonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_8() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("+Antonio+");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

	 @Test
	 public void TC1_9() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		 when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
		 when(request.getParameter("p")).thenReturn("12345678");
		 when(request.getParameter("n")).thenReturn("Antonio");
		 when(request.getParameter("c")).thenReturn("");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("3335209765");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

@Test
      public void TC1_10() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("LandiLandiLandiLandiLandi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }
      @Test
      public void TC1_11() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("_Landi_");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_12() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_13() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli via crisoli via crisoli vaia crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_14() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli_235 54");
          when(request.getParameter("t")).thenReturn("3335209765");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_15() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("33352097");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_16() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("333520978754");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

      @Test
      public void TC1_17() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("333+54_525");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }

	 @Test
	 public void TC1_18() throws ServletException, IOException  {
		 ra = new RegistrazioneAcquirente(); 

		 when(request.getSession()).thenReturn(session);
		 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
		 when(request.getParameter("p")).thenReturn("12345678");
		 when(request.getParameter("n")).thenReturn("Antonio");
		 when(request.getParameter("c")).thenReturn("Landi");
		 when(request.getParameter("i")).thenReturn("via crisoli 54");
		 when(request.getParameter("t")).thenReturn("");

		 StringWriter stringWriter = new StringWriter();
		 PrintWriter writer = new PrintWriter(stringWriter);
		 when(response.getWriter()).thenReturn(writer);
		 ra.doPost(request, response);
		 writer.flush(); 
		 assertTrue(stringWriter.toString().contains("false"));
	 }

      @Test
      public void TC1_19() throws ServletException, IOException  {
     	 ra = new RegistrazioneAcquirente(); 

     	 when(request.getSession()).thenReturn(session);
     	 when(request.getParameter("emai")).thenReturn("atlandi@gmail.it");
          when(request.getParameter("p")).thenReturn("12345678");
          when(request.getParameter("n")).thenReturn("Antonio");
          when(request.getParameter("c")).thenReturn("Landi");
          when(request.getParameter("i")).thenReturn("via crisoli 54");
          when(request.getParameter("t")).thenReturn("3335209754");

          StringWriter stringWriter = new StringWriter();
          PrintWriter writer = new PrintWriter(stringWriter);
          when(response.getWriter()).thenReturn(writer);
          ra.doPost(request, response);
          writer.flush(); 
          assertTrue(stringWriter.toString().contains("false"));
       }
	  
}


