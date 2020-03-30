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

import Model.Venditore;
import Model.VenditoreDAO;

@WebServlet("/LoginVenditore")
public class LoginVenditore extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession htp=request.getSession(); 
		String pi = request.getParameter("pi");
		String password = request.getParameter("password");
		int cont=0;
		String result ="false";
		try {
			VenditoreDAO ac = new VenditoreDAO();
			List<Venditore> lista = ac.ListVenditori();
			for(int i=0; i<lista.size(); i++,cont ++)
			{
				if((lista.get(i).getPi().equals(pi))&&(lista.get(i).getPassword().equals(password)))
				{
					htp.setAttribute("pi",pi);
					request.setAttribute("risposta", true);
					result="true";
					response.getWriter().write(result);
					RequestDispatcher view = request.getRequestDispatcher("AccountVend.jsp");
					view.forward(request, response);
				
				}
			}
			if(cont==lista.size())
			{
				List<Venditore> lista1 = ac.ListVenditori();
				for(int i=0; i<lista1.size(); i++,cont ++)
				{
					if(lista1.get(i).getPi().equals(pi)) {
						request.setAttribute("failVend","noPass");
						request.setAttribute("risposta", true);
						response.getWriter().write(result);
						RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
						view.forward(request, response);
					}
				}
				
			request.setAttribute("failVend","noPi");
			request.setAttribute("risposta", true);
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
		}} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write(result);
		}
		

	}
	}

	


