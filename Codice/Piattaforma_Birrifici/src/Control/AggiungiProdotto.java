package Control;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Model.*;



@MultipartConfig
@WebServlet("/AggiungiProdotto")
public class AggiungiProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "";


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {
		String nome = request.getParameter("nome");
		String colore=request.getParameter("colore");
		double gradazione = Double.parseDouble(request.getParameter("gradazione"));
		String descrizione = request.getParameter("descrizione");
		int quantita= Integer.parseInt(request.getParameter("quantitaAgg"));
		double prezzo = Double.parseDouble(request.getParameter("prezzo"));
		int cont=0;
		String result = "false";
		
	try {
		if(prezzo==0) {
			request.setAttribute("failAggiungi", "prezzo");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(quantita==0) {
			request.setAttribute("failAggiungi", "quantita");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!descrizione.matches("^[\\sa-zA-Z ]*$")||descrizione.length()>100) {
			request.setAttribute("failAggiungi", "descrizione");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!colore.matches("^[a-zA-Z ]*$")||colore.length()>24) {
			request.setAttribute("failAggiungi", "colore");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if((gradazione>99)||gradazione<1) {
			request.setAttribute("failAggiungi", "gradazione");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}
		else
		if(!nome.matches("^[a-zA-Z ]*$")||nome.length()>24) {
			request.setAttribute("failAggiungi", "nome");
			response.getWriter().write(result);
			RequestDispatcher view = request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
			cont++;
		}

				ProdottoDAO nuovo = new ProdottoDAO();
				ArrayList<Prodotto> lista=nuovo.dammiProdotti(nome);
				if(lista.size()!=0) {
					request.setAttribute("nome",nome);
					response.getWriter().write(result);
					RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
					view.forward(request, response);
				}
				else {
					HttpSession htp=request.getSession(); 
					String pi = (String) htp.getAttribute("pi");
					htp.setAttribute("pi",pi);


					if (request.getParameter("foto")!=null) {				
						String foto = ""; 

						String appPath = request.getServletContext().getRealPath("");

						String savePath = appPath + File.separator + SAVE_DIR;

						File fileSaveDir = new File(savePath);
						if (!fileSaveDir.exists()) {
							fileSaveDir.mkdir();
						} 

						for (Part part : request.getParts()) {
							String fileName = extractFileName(part);
							if (fileName != null && !fileName.equals("")){
								fileName = new File(fileName).getName();
								part.write(savePath + File.separator + fileName);
								foto = fileName;
							}
						}

						nuovo.inserisciProdotto(nome, pi, colore, gradazione, descrizione, quantita, prezzo, foto);
						result="true";
						response.getWriter().write(result);
						RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
						view.forward(request, response);	
					}else {


						System.out.println(pi);
						nuovo.inserisciProdotto(nome, pi, colore, gradazione, descrizione, quantita, prezzo, null);
						result="true";
						response.getWriter().write(result);
						RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
						view.forward(request, response);
					}} }catch (Exception e) {
						e.printStackTrace();
						response.getWriter().write(result);
					}

		}



	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		System.out.println("contentDisp= " + contentDisp);
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return ""; 
	}
}
