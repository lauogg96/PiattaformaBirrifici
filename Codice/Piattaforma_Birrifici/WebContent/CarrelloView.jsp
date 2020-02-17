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
<title>Il tuo Carrello</title>
</head>
<body>
<%
	String email = (String) session.getAttribute("email");
	session.setAttribute("email",email);
%>
<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
<p style="color:gold; margin-left:37%; font-size:150%">Ecco il tuo carrello <%=email %></p>
<div id="carr">
	<table id="tabcar">
	
		<tr>
			<td width="1%" >IMMAGINE</td>
			<td width="1%">NOME</td>
			<td width="1%">AZIENDA</td>
			<td width="1%">PREZZO</td>
			<td width="1%" >QUANTIT&Agrave; SCELTA</td>
			<td width="1%">TOTALE PARZIALE</td>
			<td width="1%"></td>
		</tr>
	<%
	double tot=0;
	try{
		CarrelloDAO c= new CarrelloDAO();
		ArrayList<Carrello> lista=c.dammiCarrello();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getAcquirente().equals(email)){
				String prodotto=lista.get(i).getProdotto();
				ProdottoDAO p=new ProdottoDAO();
				ArrayList<Prodotto> lista1=p.dammiProdotti(prodotto);
				VenditoreDAO v=new VenditoreDAO();
				ArrayList<Venditore> lista2=v.ListVenditori();
				for(int j=0;j<lista2.size();j++){
					if(lista2.get(j).getPi().equals(lista1.get(0).getVenditore())){
						
						String venditore=lista2.get(j).getRagioneSociale();
				%>
				
				<tr>
					<td  ><img src="<%=lista1.get(0).getFoto() %>" width="20%"></td>
					<td ><%=lista.get(i).getProdotto()%></td>
					<td ><%=venditore %></td>
					<td ><%=lista1.get(j).getPrezzo() %> &euro;/cad</td>
					<td ><%=lista.get(i).getQuantita() %></td>
					<td ><%=lista.get(i).getTotale() %> &euro;</td>
					<td><a href="EliminaDaCarrello?email=<%=email%>&nome=<%=lista1.get(j).getNome()%>"><img src="Bottoni/elimina1.png" width="50%"> </a></td>
				</tr>
		<%}}}}
			
			for(int i=0;i<lista.size();i++){
				if(lista.get(i).getAcquirente().equals(email)){
					tot=tot+lista.get(i).getTotale();
				
		%>
		
	<%}}}catch(Exception e){
		e.printStackTrace();
	}%>
	<tr><td colspan="6">TOTALE CARRELLO: <%=tot %>&euro;</td>
	<td><form action="aggiungiOrdine?email=<%=email%>" method="post"><input class="but" type="submit" value="Invia"></form></td>
	</tr>
	</table>
	</div>
	<br><br><br>
	<div id="footer">
		<table class="footer">
			<tr>
				<td><a href="chiSiamo.jsp">Chi Siamo</a></td>
				<td></td>
				<td><a href="infoPrivacy.jsp">Info Privacy</a></td>
			</tr>

			<tr>
				<td><a href="info.jsp">Ordini e Spedizioni</a></td>
				<td></td>
				<td><a href="contattaci.jsp">Contattaci</a></td>
			</tr>
		</table>
	</div>
</body>
</html>