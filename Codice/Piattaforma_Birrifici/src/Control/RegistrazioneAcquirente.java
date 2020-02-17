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

@WebServlet("/RegistrazioneAcquirente")
public class RegistrazioneAcquirente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegistrazioneAcquirente() {
        super();
        
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email= request.getParameter("e");
		String pass= request.getParameter("p");
		String nom= request.getParameter("n");
		String cog= request.getParameter("c");
		String ind= request.getParameter("i");
		String tel= request.getParameter("t");
		HttpSession htp=request.getSession(); 
		int cont=0;
		
		if(tel.length()!=0&&tel.length()!=10) {
			request.setAttribute("failReg", "errTel");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		
		if(!tel.matches("^[0-9]*$")) {
			request.setAttribute("failReg", "errTel");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		
		if(!ind.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")) {
			request.setAttribute("failReg", "errIndirizzo");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		
		if(!cog.matches("^[a-zA-Z ]*$")) {
			request.setAttribute("failReg", "errCognome");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		if(!nom.matches("^[a-zA-Z ]*$")) {
			request.setAttribute("failReg", "errFormat");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		if(nom.length()>=21) {
			request.setAttribute("failReg", "lungo");
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		if(cont==0) {
		try {
			AcquirenteDAO ac = new  AcquirenteDAO();
			ArrayList <Acquirente> lista = ac.ListAcquirenti();
			int size=lista.size();
			if(size==0)
			{
				
				ac.RegistrazioneAcquirente(email,pass,nom,cog,ind,tel);
				request.setAttribute("email", email);
				htp.setAttribute("email",email);
				RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
				view.forward(request,response);
			}
			else{
			int c=0;
			for (int i=0; i<size; i++) {
				if(lista.get(i).getEmail().equals(email))
				{
					c=1;
				}
				else if(pass.length()<8)
				{
					
					request.setAttribute("pass","corta");
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}else if(pass.length()>20)
				{
					request.setAttribute("pass", "lunga");
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}}
				if(c==0)
				{
					ac.RegistrazioneAcquirente(email,pass,nom,cog,ind,tel);
					request.setAttribute("email", email);
					htp.setAttribute("email",email);
					RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
					view.forward(request,response);
				}
				else {
					request.setAttribute("email",email);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}	
			}
				} catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
