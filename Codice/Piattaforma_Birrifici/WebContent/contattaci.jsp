<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<title>Contattaci</title>
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

	<div id="di">
						<p id="intes">Problemi?  Dubbi?  Difficolt&agrave;? <br>
				<table id="tab">
					<tr>
						<td id="p">E-MAIL</td>
					</tr>
					<tr>
						<td><hr size="5" width="80%" align="center" color="gold"></td>
					</tr>

					<tr>
						<td id="p1"><h3>Manda una mail a:</h3></td>
					</tr>
					<tr>
						<td id="p1">
								<a href="mailto:info_sunrise@libero.it">piattaformaBirrifici@gmail.com</a>
							</td>
					</tr>
				</table>
			
				<table id="tab1">
					<tr>
						<td id="p">Chiamaci!</td>
					</tr>
					<tr>
						<td><hr size="5" width="80%" align="center" color="gold"></td>
					</tr>
					<tr>
						<td id="p1">Antonio: 3774312002</td>
					</tr>
					<tr>
						<td id="p1">Laura: 3913717974</td>
					</tr>
				</table>
				<br><br><br><br><br><br>
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