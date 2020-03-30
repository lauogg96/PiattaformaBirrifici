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
       
   
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String pi= request.getParameter("pi");
	String pass= request.getParameter("pass");	
	String email= request.getParameter("email");
	String rs= request.getParameter("rs");
	String indirizzo= request.getParameter("indirizzo");
	HttpSession htp=request.getSession(); 
	String result="false";
	int cont=0;
	
	
		try {	
	if(!pass.matches("^[a-zA-Z0-9]*$")){
		request.setAttribute("failRegVend","passForm");
		response.getWriter().write(result);
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	else
	if(!email.matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
		request.setAttribute("failRegVend","errMail");
		response.getWriter().write(result);
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	else
	if(!pi.matches("^[0-9]{11}$")) {
		request.setAttribute("failRegVend", "formatoPi");
		response.getWriter().write(result);
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	else
	if(!rs.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")) {
		request.setAttribute("failRegVend", "formatoRS");
		response.getWriter().write(result);
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}
	else
	if(!indirizzo.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")) {
		request.setAttribute("failRegVend", "errIndirizzo");
		response.getWriter().write(result);
		RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
		cont++;
	}

	
			VenditoreDAO ac = new  VenditoreDAO();
			List <Venditore> lista = ac.ListVenditori();
			if(lista.size()==0)
			{
				VenditoreDAO nuovo = new VenditoreDAO();
				nuovo.RegistrazioneVenditore(pi,pass,email,rs,indirizzo);
				request.setAttribute("email", email);
				htp.setAttribute("pi",pi);
				result="true";
				response.getWriter().write(result);
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
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
				else if(pass.length()>20)
				{
					cont++;
					request.setAttribute("pass", "lunga");
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}}
				if(c==0)
				{
					VenditoreDAO nuovo = new VenditoreDAO();
					nuovo.RegistrazioneVenditore(pi,pass,email,rs,indirizzo);
					request.setAttribute("email", email);
					htp.setAttribute("pi",pi);
					result="true";
					response.getWriter().write(result);
					RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
					view.forward(request,response);
				}
				else {
					request.setAttribute("failRegVend", "piInUso");
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
			
				} }catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(result);
		}
		
	}

}
