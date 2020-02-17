package Control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;

/**
 * Servlet implementation class aggiungiOrdine
 */
@WebServlet("/aggiungiOrdine")
public class aggiungiOrdine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aggiungiOrdine() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String email=(String)htp.getAttribute("email");
		htp.setAttribute("email",email);
		GregorianCalendar gc = new GregorianCalendar();
		int gg = gc.get(Calendar.DATE);
		int mm = gc.get(Calendar.MONTH)+1;
		int aaaa = gc.get(Calendar.YEAR);
		try{
			CarrelloDAO cr= new CarrelloDAO();
			ArrayList <Carrello> lista = cr.dammiCarrello();
			OrdineDAO or = new OrdineDAO();
				for(int i=0;i<lista.size();i++) {
				if(lista.get(i).getAcquirente().equals(email)) {
					String id = UUID.randomUUID().toString();
					ProdottoDAO p=new ProdottoDAO();
					ArrayList<Prodotto> pr=p.dammiProdotti(lista.get(i).getProdotto());
					if(lista.get(i).getQuantita()<=pr.get(0).getQuantita()) {
					p.aggiornaQuantita(pr.get(0).getNome(),qu(pr.get(0).getQuantita(),lista.get(i).getQuantita()));
					Ordine nuovo=new Ordine(id,email,lista.get(i).getProdotto(),lista.get(i).getQuantita(),lista.get(i).getTotale(),gg,mm,aaaa,"In Elaborazione");
					or.inserisciOrdine(nuovo);
					cr.eliminaCarrello(email, lista.get(i).getProdotto());
					RequestDispatcher view =  request.getRequestDispatcher("LoginHome.jsp");
					view.forward(request, response);
				}
					else {
						request.setAttribute("pii", "pii");
						RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
						view.forward(request, response);
					}
				}
			}
		
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	private int qu(int prima, int meno) {
		return prima-meno;
	}
}
