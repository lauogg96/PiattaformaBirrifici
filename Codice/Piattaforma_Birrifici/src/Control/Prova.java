package Control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Acquirente;
import Model.AcquirenteDAO;


@WebServlet("/Prova")
public class Prova  extends HttpServlet{
	 private static final long serialVersionUID = 1L;
     
	    public Prova() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        String email= request.getParameter("email");
	        String password= request.getParameter("password");
	        String nome= request.getParameter("nome");
	        String cognome= request.getParameter("cognome");
	        String indirizzo= request.getParameter("indirizzo");
	        String numTelefono= request.getParameter("numTelefono");
	     



	        try {
	            AcquirenteDAO ac = new  AcquirenteDAO();
	            ArrayList <Acquirente> lista = ac.ListAcquirenti();


	            
	            
	                AcquirenteDAO nuovo = new AcquirenteDAO();
	                nuovo.RegistrazioneAcquirente(email, password, nome, cognome, indirizzo, numTelefono);
	                RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
	                view.forward(request, response);

	                
	                } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        doGet(request, response);
	    }
}
