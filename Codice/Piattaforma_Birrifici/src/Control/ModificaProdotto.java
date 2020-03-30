package Control;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.ProdottoDAO;

/**
 * Servlet implementation class ModificaProdotto
 */
@WebServlet("/ModificaProdotto")
public class ModificaProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String pi = (String) htp.getAttribute("pi");
		htp.setAttribute("pi",pi);
		String nome=request.getParameter("nome");
		String descrizione=request.getParameter("descrizione");
		double prezzo=Double.parseDouble(request.getParameter("prezzo"));
		int qua=Integer.parseInt(request.getParameter("qua"));
		int cont=0;
		String result="false";
	try {	
		if(qua==0) {
			request.setAttribute("failModifica", "quantita");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}else
		
		if(!descrizione.matches("^[\\sa-zA-Z ]*$")||descrizione.length()>100) {
			request.setAttribute("failModifica", "descrizione");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}else
		
		if(prezzo==0) {
			request.setAttribute("failModifica", "prezzo");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
	
	
			ProdottoDAO pr= new ProdottoDAO();
			pr.modificaProdotto(nome, descrizione, prezzo, qua);
			result="true";
			response.getWriter().write(result);
			RequestDispatcher view =  request.getRequestDispatcher("ListaProdottiVend.jsp");
			view.forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
			response.getWriter().write(result);
		}
	}
	



}
