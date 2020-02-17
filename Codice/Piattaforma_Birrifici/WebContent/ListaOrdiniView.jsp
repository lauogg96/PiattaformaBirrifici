<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import=" Model.*" %>
	<%@page	import="java.util.*"%>
	<%@page import=" Control.*" %>
	<%@page	import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<title>I tuoi Ordini</title>
</head>
<body>
<%
	String email = (String) session.getAttribute("email");
	session.setAttribute("email",email);
%>
<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
<p style="color:gold; margin-left:37%; font-size:150%">Ecco i tuoi ordini <%=email %></p>
<div id="carr">
	<table id="tabcar">
	
		<tr>
			<td width="1%" >IMMAGINE</td>
			<td width="1%">NOME</td>
			<td width="1%">AZIENDA</td>
			<td width="1%">PREZZO</td>
			<td width="1%">QUANTIT&Agrave;</td>
			<td width="1%">TOTALE</td>
			<td width="1%">STATO DELL'ORDINE</td>
		</tr>
	<%try{
		OrdineDAO or=new OrdineDAO();
		ArrayList<Ordine> lista=or.dammiOrdine();
		int cont=0;
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getAcquirenteOr().equals(email)){
				ProdottoDAO p=new ProdottoDAO();
				ArrayList<Prodotto> pr=p.dammiProdotti(lista.get(i).getProdottoOr());
				cont++;
	%>	
	<tr>
					<td  ><img src="<%=pr.get(0).getFoto() %>" width="20%"></td>
					<td ><%=lista.get(i).getProdottoOr()%></td>
					<td ><%=pr.get(0).getVenditore() %></td>
					<td ><%=pr.get(0).getPrezzo() %> &euro;/cad</td>
					<td ><%=lista.get(i).getQuantita() %></td>
					<td ><%=lista.get(i).getPrezzo() %> &euro;</td>
					<td><%=lista.get(i).getStato() %></td>
				</tr>	
	<%}}
		if(cont==0){
			request.setAttribute("noOrdini","noOrdini");
			RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
			view.forward(request, response);
		}	
	}catch(Exception e){
		e.printStackTrace();
	} 
	%>
	</table>
	</div>
</body>
</html>