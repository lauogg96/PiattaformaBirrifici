package Control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cerca
 */
@WebServlet("/Cerca")
public class Cerca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession htp=request.getSession(); 
		String email=(String)htp.getAttribute("email");
		htp.setAttribute("email",email);
		String cerca=request.getParameter("cerca");
		
		int cont=0;
		String result="false";
	try {	
		if((!cerca.matches("^[a-zA-Z ]*$")||cerca.length()>24)&&(!cerca.matches("^[0-9]{11}$"))&&(!cerca.matches("^[a-zA-Z ]*$")||cerca.length()>24)){
			request.setAttribute("failCerca", "cerca");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		
		if(cont==0) {
			request.setAttribute("cerca",cerca);
			result="true";
			response.getWriter().write(result);
			RequestDispatcher view =  request.getRequestDispatcher("ListaProdView.jsp");
			view.forward(request, response);
		}
	}catch(Exception e){
		e.printStackTrace();
		response.getWriter().write(result);
	}
	
	}


	
}
