<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<title>Chi Siamo</title>
</head>
<body>
<%
		String email = (String) session.getAttribute("email");
		session.setAttribute("email",email);
		String pi = (String) session.getAttribute("pi");
		session.setAttribute("pi",pi);
	if(email!=null){
	%>
	<div>
	<b id="ben"> Benvenuto:
	<%
		out.print(email);
	%>
	</b>
	<div class="container">
		<nav class="login" style="margin-left:35%; margin-right:11%;">
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
<%} 
	else{
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
<%} %>
<img class="logo" src="Foto/Logo.png">
	</div>
	<div id="Siamo">
				<br><br>
	<hr size="6%" color="gold" style="margin-top:2%;">	
					<p class="int">OGNI ALCOOL HA UNA STORIA, OGNI STORIA HA UN ALCOOL	
					<p class="chi" ><b>Piattaforma Birrifici</b> vuole rendere di facile reperibilita&grave; prodotti speciali ed artigianali, favorendo la circolazione e la crescita della cultura birraria.</p>
					<p class="chi">In accordo con i produttori, vuole essere un referente unico, facile e preparato che sappia guidare alla scelta e all'acquisto della birra giusta.</p>
					<ul class="chi">
  						<li>Devi organizzare una cena fra amici o in famiglia?</li>
  						<li>Sei uno sperimentatore del gusto o un collezionista di novità?</li>
 						<li>Sei una fidanzata premurosa che sa cosa vuole?</li>
 						<li>Sei un privato o un gestore di locale?</li>
					</ul>
					<p  class="chi"><b>Riusciremo a soddisfare la tua curiosita&grave; e le tue esigenze in modo comodo ed economico.</b></p>
					<div>
						<p class="sp">E-Shop, comodo e sicuro</p>
						<p class="sp1">Uno strumento semplice ma approfondito per coloro la cui curiosita&grave; e consapevolezza del gusto li <br>spinge alla ricerca di nuovi mondi e nuove conoscenze birrarie.</p>
					</div>
	</div>
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