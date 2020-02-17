package Control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;
import java.util.*;

@WebServlet("/RegistrazioneVenditore")
public class RegistrazioneVenditore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegistrazioneVenditore() {
        super();
        
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String pi= request.getParameter("pi");
	String pass= request.getParameter("pass");	
	String email= request.getParameter("email");
	String rs= request.getParameter("rs");
	String indirizzo= request.getParameter("indirizzo");
	HttpSession htp=request.getSession(); 
	int cont=0;
	
	if(!pi.matches("^[0-9]{11}$")) {
		request.setAttribute("failRegVend", "formatoPi");
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	
	if(!rs.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")) {
		request.setAttribute("failRegVend", "formatoRS");
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	
	if(!indirizzo.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")) {
		request.setAttribute("failRegVend", "errIndirizzo");
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	
	if(cont==0) {
		try {
			VenditoreDAO ac = new  VenditoreDAO();
			List <Venditore> lista = ac.ListVenditori();
			if(lista.size()==0)
			{
				VenditoreDAO nuovo = new VenditoreDAO();
				nuovo.RegistrazioneVenditore(pi,pass,email,rs,indirizzo);
				request.setAttribute("email", email);
				htp.setAttribute("pi",pi);
				RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
				view.forward(request,response);
			}
			else{
				int c=0;
			for (int i=0; i<lista.size(); i++) {
			
				if((lista.get(i).getPi().equals(pi)))
				{
					c=1;
					
				}
				else if(pass.length()<8)
				{
					
					request.setAttribute("pass", "corta");
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
				else if(pass.length()>20)
				{
					cont++;
					request.setAttribute("pass", "lunga");
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}}
				if(c==0)
				{
					VenditoreDAO nuovo = new VenditoreDAO();
					nuovo.RegistrazioneVenditore(pi,pass,email,rs,indirizzo);
					request.setAttribute("email", email);
					htp.setAttribute("pi",pi);
					RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
					view.forward(request,response);
				}
				else {
					request.setAttribute("failRegVend", "piInUso");
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
			
				} }catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
