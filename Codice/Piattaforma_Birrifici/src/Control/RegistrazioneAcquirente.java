package Control;

import java.io.IOException;
import java.util.List;
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String email= request.getParameter("emai");
		String pass= request.getParameter("p");
		String nom= request.getParameter("n");
		String cog= request.getParameter("c");
		String ind= request.getParameter("i");
		String tel= request.getParameter("t");
		HttpSession htp=request.getSession(); 
		String result="false";
		int cont=0;
		
		try {
		if(!pass.matches("^[a-zA-Z0-9]*$")){
			request.setAttribute("failReg","passForm");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}else
		
		if(!email.matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
			
			request.setAttribute("failReg","errMail");
			response.getWriter().write(result);

			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);

			cont++;
			
			
			
		}
		else
		if(tel.length()!=0&&tel.length()!=10) {
			request.setAttribute("failReg", "errTel");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!tel.matches("^[0-9]*$")) {
			request.setAttribute("failReg", "errTel");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		
		if(!ind.matches("^[a-zA-Z0-9\\.\\,\\-\\/\\']+[a-zA-Z0-9\\.\\,\\-\\/\\' ]*$")||ind.length()>40) {
			request.setAttribute("failReg", "errIndirizzo");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!cog.matches("^[a-zA-Z ]*$")||cog.length()>20) {
			request.setAttribute("failReg", "errCognome");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!nom.matches("^[a-zA-Z ]*$")) {
			request.setAttribute("failReg", "errFormat");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(nom.length()>=21) {
			request.setAttribute("failReg", "lungo");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		
			AcquirenteDAO ac = new  AcquirenteDAO();
			ArrayList <Acquirente> lista = ac.ListAcquirenti();
			int size=lista.size();
			if(size==0)
			{
				
				ac.RegistrazioneAcquirente(email,pass,nom,cog,ind,tel);
				request.setAttribute("email", email);
				htp.setAttribute("email",email);
				result="true";
				response.getWriter().write(result);
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
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}else if(pass.length()>20)
				{
					request.setAttribute("pass", "lunga");
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}}
				if(c==0)
				{
					ac.RegistrazioneAcquirente(email,pass,nom,cog,ind,tel);
					request.setAttribute("email", email);
					htp.setAttribute("email",email);
					result="true";
					response.getWriter().write(result);
					RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
					view.forward(request,response);
				}
				else {
					request.setAttribute("failReg","email");
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					//Oggetto view == null! controllare!
					view.forward(request, response);
					cont++;
				}	
			}
			
					
			/*if(cont==0) {
				response.getWriter().write(result);
			}
			else {
				result="false";
				response.getWriter().write(result);
			}*/
				} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(result);
		}
		
	}

}
