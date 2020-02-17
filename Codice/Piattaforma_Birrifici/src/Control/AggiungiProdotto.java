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

/**
 * Servlet implementation class AggiungiBirVin
 */
@MultipartConfig
@WebServlet("/AggiungiProdotto")
public class AggiungiProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "";

    public AggiungiProdotto() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			ProdottoDAO nuovo = new ProdottoDAO();
			ArrayList<Prodotto> lista=nuovo.dammiProdotti(nome);
			if(lista.size()!=0) {
				request.setAttribute("nome",nome);
				RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
				view.forward(request, response);
			}
			else {
				HttpSession htp=request.getSession(); 
				String pi = (String) htp.getAttribute("pi");
				htp.setAttribute("pi",pi);
		
		String colore = request.getParameter("colore");
		double gradazione = Double.parseDouble(request.getParameter("gradazione"));
		String descrizione = request.getParameter("descrizione");
		int quantita= Integer.parseInt(request.getParameter("quantitaAgg"));
		double prezzo = Double.parseDouble(request.getParameter("prezzo"));

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
			RequestDispatcher view =  request.getRequestDispatcher("AccountVend.jsp");
			view.forward(request, response);
		} }catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
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
