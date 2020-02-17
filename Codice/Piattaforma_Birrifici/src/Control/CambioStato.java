package Control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Ordine;
import Model.OrdineDAO;

/**
 * Servlet implementation class CambioStato
 */
@WebServlet("/CambioStato")
public class CambioStato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambioStato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String pi = (String) htp.getAttribute("pi");
		htp.setAttribute("pi",pi);
		String cod=request.getParameter("cod");
		String stato=request.getParameter("stato");
		
		try {
			OrdineDAO o=new OrdineDAO();
			ArrayList<Ordine> lista=o.dammiOrdine();
			for(int i=0;i<lista.size();i++) {
				if(lista.get(i).getCod_ordine().equals(cod)) {
					o.aggiornaStato(stato, cod);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("pi",pi);
		RequestDispatcher view = request.getRequestDispatcher("ListaOrdiniVend.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
