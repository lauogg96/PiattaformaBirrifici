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

import Model.Acquirente;
import Model.AcquirenteDAO;

@WebServlet("/LoginAcquirente")
public class LoginAcquirente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession htp=request.getSession(); 
		String emailAc = request.getParameter("emailAc");
		String password = request.getParameter("password");
		int cont=0;
		try {
			AcquirenteDAO ac = new AcquirenteDAO();
			List<Acquirente> lista = ac.ListAcquirenti();
			for(int i=0; i<lista.size(); i++,cont ++)
			{
				if((lista.get(i).getEmail().equals(emailAc))&&(lista.get(i).getPassword().equals(password)))
				{
					htp.setAttribute("email",emailAc);
					RequestDispatcher view = request.getRequestDispatcher("LoginHome.jsp");
					view.forward(request, response);
				
				}
			}
			if(cont==lista.size())
			{
				List<Acquirente> lista1 = ac.ListAcquirenti();
				for(int i=0;i<lista1.size();i++) {
				if(lista1.get(i).getEmail().equals(emailAc)) {
					String failLogin="noPass";
					request.setAttribute("failLogin", failLogin);
					RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
			}				
				}
				String failLogin="noEmail";
				request.setAttribute("failLogin", failLogin);
				RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	}

	


