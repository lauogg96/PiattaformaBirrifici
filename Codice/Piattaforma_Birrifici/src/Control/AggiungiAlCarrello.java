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

import Model.*;

/**
 * Servlet implementation class AggiungiAlCarrello
 */
@WebServlet("/AggiungiAlCarrello")
public class AggiungiAlCarrello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AggiungiAlCarrello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String email=(String)htp.getAttribute("email");
		htp.setAttribute("email",email);
		String acquirente=request.getParameter("acquirente");
		String prodotto=request.getParameter("prodotto");
		int quantita=Integer.parseInt(request.getParameter("quantita"));
		double prezzo=Double.parseDouble(request.getParameter("prezzo"));
		if(quantita<=0) {
			request.setAttribute("quantita", quantita);
			RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
		}
		try {
			CarrelloDAO c=new CarrelloDAO();
			ArrayList<Carrello> car= c.dammiCarrello();
			ProdottoDAO p=new ProdottoDAO();
			ArrayList<Prodotto> prod=p.dammiProdotti(prodotto);
			System.out.println(prodotto);
			if(car.size()==0) {
				
				if(quantita<=prod.get(0).getQuantita()) {
				Carrello ca=new Carrello(acquirente,prodotto,quantita,tot(quantita,prezzo));
				c.inserisciCarrello(ca);
				RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
				view.forward(request, response);
			}
				else {
					request.setAttribute("quantita", quantita);
					RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
				}
			else {
				int cont=0;
				for(int i=0; i<car.size();i++) {
					int quantitaTot=quantita+car.get(i).getQuantita();
					if(acquirente.equals(car.get(i).getAcquirente())&&prodotto.contentEquals(car.get(i).getProdotto())) {
						
						if(quantitaTot<=prod.get(0).getQuantita()&&quantita>0) {
						c.aggiornaCarrello(quantitaTot, tot(quantitaTot,prezzo), prodotto, acquirente);
						RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
						view.forward(request, response);
					}
						else {
							request.setAttribute("quantita", quantitaTot);
							RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
							view.forward(request, response);
						}
				}
				cont ++;
				}
				if(cont==car.size()) {
					
						if(quantita<=prod.get(0).getQuantita()&&quantita>0) {
						Carrello ca=new Carrello(acquirente,prodotto,quantita,tot(quantita,prezzo));
						c.inserisciCarrello(ca);
						RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
						view.forward(request, response);
						}
					else {
						request.setAttribute("quantita",quantita);
						RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
						view.forward(request, response);
					}
			}
				}}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private double tot(int x, double y)
	{
		double z = x*y;
		double a = Math.floor(z*100)/100;
		return a;
		}
}
