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
<title>Lista Prodotti</title>
</head>
<body>
<%
	String cerca= request.getParameter("cerca");

	String email = (String) session.getAttribute("email");
	session.setAttribute("email",email);
	if(email==null){
%>
<div id="RegLogTendina"></div>
	<div class="container">
		<nav class="login">
			<ul>
				<li class="slidesotto">Registrati
					<ul class="nascosto">
						<li><a href="RegistrazioneAcquirente.jsp">Registrazione
								Acquirente</a></li>
						<li><a href="RegistrazioneVenditore.jsp">Registrazione
								Venditore</a></li>
					</ul>
				</li>
				<li class="slidesotto">Login
					<ul class="nascosto">
						<li><a href="LoginAcquirente.jsp">Login Acquirente</a></li>
						<li><a href="LoginVenditore.jsp">Login Venditore</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
	<%
	}
	else{
	%>
	<a href="LogoutAcquirente?email=<%= email %>">Logout</a><br>
	</b>
	<div class="container">
		<nav class="login"style="margin-left:35%;margin-right:11%;">
		<ul>
			<li class="slidesotto"><a style="font-size: 20px" href="AccountAreaView.jsp">Account Area</a>
				<ul class="nascosto">
					<li><a style="font-size: 15px" href="CarrelloView.jsp">Carrello</a></li>
					<li><a style="font-size: 15px"href="ListaOrdiniView.jsp">I miei ordini</a></li>
					<li><a style="font-size: 15px" href="FormModifica.jsp">Modifica Dati</a></li>
				</ul>
			</li>
			</ul>
		</nav>
</div>
<%} %>
<div>
	<img class="logo" src="Foto/Logo.png">
</div>
<div style="margin-left:41%;">
<form action="Cerca" method="post" name="cerca" id="cerca">
	<b>Cerca:<input id="cerca" type="text" name="cerca" required="required"> 
	
		<input class="butCerca" type="submit" value="Invia"></b>
	
	</form>
	</div>
		

<div id="carr">
					
		<br><br>
			<table id="tabcar">
				<tr >
					<td width="15%" >IMMAGINE</td>
					<td width="15%">NOME</td>
					<td width="15%">COLORE</td>
					<td width="15%">AZIENDA</td>
					<td width="15%">PREZZO</td>
					<td width="15%" >QUANTIT&Agrave; DISPONIBILE</td>
					<td>
				</tr>
	<%
		try {
			
			ProdottoDAO pr = new  ProdottoDAO();
			ArrayList <Prodotto> lista = pr.dammiProdotti(cerca);
			if(lista.size()==0){
				request.setAttribute("cerca",cerca);
				RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
				view.forward(request, response);
			}
			for(int i=0; i<lista.size();i++)
				{
				if(email==null){	
					VenditoreDAO vd=new VenditoreDAO();
					ArrayList<Venditore> list=vd.ListVenditori();
					for(int j=0;j<list.size();j++){
						if(list.get(j).getPi().equals(lista.get(i).getVenditore())){
						
					
		%>
						
				<tr>
					<td><img src="<%=lista.get(i).getFoto() %>" width="20%"></td>
					<td> <%=lista.get(i).getNome()%> </td>
					<td> <%=lista.get(i).getColore()%> </td>
					<td> <%=list.get(i).getRagioneSociale() %> </td>
					<td><%=lista.get(i).getPrezzo() %>&euro; /cad</td>
					<td><%=lista.get(i).getQuantita() %></td>
					<td><div class="bottoni"><button class="but" onclick="document.getElementById('<%=lista.get(i).getNome()%>').style.display='block'" >Dettagli</button></div>
					</tr>
			 <div id="<%=lista.get(i).getNome()%>" class="modal">
  			<span onclick="document.getElementById('<%=lista.get(i).getNome()%>').style.display='none'" class="close" title="Close Modal" style="color: gold;">&times;</span>
								
			<p style="color:gold;margin-left:40%; font-size:200% ">Scheda Prodotto</p>						
			 
			<nav style="margin-left:35%">
			<ul >
			<li><img src="<%=lista.get(i).getFoto() %>" width="10%"></li><br>
			 <li style="padding-bottom: 3%;">Nome: <%=lista.get(i).getNome()%></li><br>
			 <li style="padding-bottom: 3%;">Produttore: <%=list.get(i).getRagioneSociale()%></li><br>
			 <li style="padding-bottom: 3%;">Descrizione:  <%=lista.get(i).getDescrizione()%></li><br>
		 	 <li style="padding-bottom: 3%;">Gradazione:  <%=lista.get(i).getGradazione()%></li><br>
			 <li style="padding-bottom: 3%;">Colore:  <%=lista.get(i).getColore()%></li><br>
			 <li style="padding-bottom: 3%;">Quantit&agrave;:  <%=lista.get(i).getQuantita() %></li><br>
			 <li style="padding-bottom: 3%;">Prezzo: <%=lista.get(i).getPrezzo()%>&euro; /cad</li><br>
			 <li style="padding-bottom:3%;"><a href="LoginAcquirente.jsp" style="font-size:150%">Esegui il login per acquistare</a></li>
			</ul>
			</nav>
			 </div>
			
		<% }}}
		else{
			VenditoreDAO vd=new VenditoreDAO();
			ArrayList<Venditore> list=vd.ListVenditori();
			for(int j=0;j<list.size();j++){
				if(list.get(j).getPi().equals(lista.get(i).getVenditore())){
		%>
		<tr>
					<td><img src="<%=lista.get(i).getFoto() %>" width="20%"></td>
					<td> <%=lista.get(i).getNome()%> </td>
					<td> <%=lista.get(i).getColore()%> </td>
					<td> <%=list.get(i).getRagioneSociale() %> </td>
					<td><%=lista.get(i).getPrezzo() %>&euro; /cad</td>
					<td><%=lista.get(i).getQuantita() %></td>
					<td><div class="bottoni"><button class="but"onclick="document.getElementById('<%=lista.get(i).getNome()%>').style.display='block'">Dettagli</button></div>
					</tr>
			 <div id="<%=lista.get(i).getNome()%>" class="modal">
  			<span onclick="document.getElementById('<%=lista.get(i).getNome()%>').style.display='none'" class="close" title="Close Modal" style="color: gold;">&times;</span>
								
			<p style="color:gold;margin-left:40%; font-size:200% ">Scheda Prodotto</p>						
			<form action="AggiungiAlCarrello?acquirente=<%=email %>" method="post">
			<input id="codice" type="hidden" name="prodotto" value="<%=lista.get(i).getNome()%>">
			<input id="codice" type="hidden" name="acquirente" value="<%=email%>">
			<input id="codice" type="hidden" name="prezzo" value="<%=lista.get(i).getPrezzo()%>">
			<nav style="margin-left:35%">
			<ul>
			<li><img src="<%=lista.get(i).getFoto() %>" width="10%"></li><br>
			 <li style="padding-bottom: 3%;">Nome: <%=lista.get(i).getNome()%></li><br>
			 <li style="padding-bottom: 3%;">Produttore: <%=list.get(i).getRagioneSociale()%></li><br>
			 <li style="padding-bottom: 3%; ">Descrizione: <%=lista.get(i).getDescrizione()%></li><br>
		 	 <li style="padding-bottom: 3%; ">Gradazione: <%=lista.get(i).getGradazione()%></li><br>
			 <li style="padding-bottom: 3%; ">Colore: <%=lista.get(i).getColore()%></li><br>
			 <li style="padding-bottom: 3%; ">Quantit&agrave;: <%=lista.get(i).getQuantita() %></li><br>
			 <li style="padding-bottom: 3%; ">Prezzo: <%=lista.get(i).getPrezzo()%>&euro; /cad</li><br>
			 <li style="padding-bottom:3%;">Quantità da aggiungere: <input id="in" tipe="number" name="quantita" min="1" max="<%=lista.get(i).getQuantita() %>" step="1" value="0"></li><br>
			 <li style="padding-bottom:3%; "><div class="bottoni"><input class="but" type="submit" value="Aggiungi al carrello"></div></li>
			</ul>
			</nav>
			</form>
			 </div>
						
		<%}}}}}catch(Exception e){
			e.printStackTrace();
		} %>
	
	</table></div><br><br>
	
	
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