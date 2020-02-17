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

import Model.Acquirente;
import Model.AcquirenteDAO;

/**
 * Servlet implementation class ModificaProfilo
 */
@WebServlet("/ModificaProfilo")
public class ModificaProfilo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaProfilo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String email=(String)htp.getAttribute("email");
		
		String password = request.getParameter("password");
		String tel=request.getParameter("tel");
		String indirizzo=request.getParameter("indirizzo");
		System.out.println(indirizzo);
		try {
			AcquirenteDAO a=new AcquirenteDAO();
		
				ArrayList<Acquirente> lista=a.ListAcquirenti();
				int c=0;
				if(c==0) {
					for(int i=0;i<lista.size();i++) {
						if(lista.get(i).getEmail().equals(email)) {
							a.ModificaDati(tel, password, indirizzo, email);
							htp.setAttribute("email",email);
							RequestDispatcher view = request.getRequestDispatcher("LoginHome.jsp");
							view.forward(request, response);
						}
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
