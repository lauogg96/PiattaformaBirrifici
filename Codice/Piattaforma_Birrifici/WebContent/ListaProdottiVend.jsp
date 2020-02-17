
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import=" Model.*" %>
	<%@page	import="java.util.*"%>
	<%@page import=" Control.*" %>
<%@page	import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="Css/Smartphone.css" />
<link rel="stylesheet" type="text/css" href="Css/Tablet.css" />
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />

<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<script type="text/javascript" src="Js/jquery.nivo.slider.js"></script>


	<link rel="icon" href="Foto/logo.png">
<title>I tuoi prodotti</title>
</head>
<body>
	
	<%
	String pi = (String) session.getAttribute("pi");
	session.setAttribute("pi",pi);
	%>
	<div>
		<img class="logo" src="Foto/Logo.png">
	</div>


	<div id="prod">
					
					<p><br><br>
					<table id="tabp">
						<tr >
						<td width="1%" >IMMAGINE</td>
						<td width="1%">NOME</td>
						<td width="1%">AZIENDA</td>
						<td width="1%">PREZZO</td>
						<td width="1%" >QUANTIT&Agrave; DISPONIBILE</td>
						<td width="1%"></td>
						<td width="1%"></td>
						<td width="1%"></td>
						</tr>
						<%
			try {
			
			ProdottoDAO pr = new  ProdottoDAO();
				
				ArrayList <Prodotto> lista = pr.dammiProdotti(pi);
						if(lista.size()==0){
							request.setAttribute("noProd","noProd");
							RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
							view.forward(request, response);
						}

							
							for(int i=0; i<lista.size();i++)
							{
								
									
							
									%>
								
									<tr>
											
											<td><img src="<%=lista.get(i).getFoto() %>" width="10%"></td>
											<td> <%=lista.get(i).getNome()%> </td>
										    <td ><%=lista.get(i).getVenditore()%></td>
										    <td><%=lista.get(i).getPrezzo() %>&euro; /cad</td>
										    <td><%=lista.get(i).getQuantita() %></td>
										    <td >
									<form ACTION="Elimina?nome=<%=lista.get(i).getNome() %>" method="post">
									
										<input class="but" type="submit" value="Elimina">
									</form>	</td>
									<td>
									<form ACTION="Modifica?nome=<%=lista.get(i).getNome() %>" method="post">
									
										<input class="but" type="submit" value="Modifica">
									</form></td>
												<% } %>
								</tr>
						<%
				 }catch (Exception e){
					 out.println("An exception occurred: " + e.getMessage());}
		%>
	</table>
		</div>		
				
				
				

	
</body>
</html>