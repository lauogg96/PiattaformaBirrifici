<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<title>LoginVenditore</title>
</head>
<body>

<div id="RegLogTendina">	
		
				</div>
			<div class="container">
		<nav class="login">
		<ul>
			<li class="slidesotto">Registrati
				<ul class="nascosto">
					<li><a href="RegistrazioneAcquirente.jsp">Registrazione Acquirente</a></li>
					<li><a href="RegistrazioneVenditore.jsp">Registrazione Venditore</a></li>
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
<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
	<div id="log">
		<form  method="post" ACTION="LoginVenditore" id="for">	
			<fieldset id="field">
				<p>
					<font size="15"> Accedi<br></font>
				</p>
				<p>
					<b>Partita IVA:<input id="in" type="text" name="pi" placeholder="pi" required="required"><br>
					<br> Password:</b><input id="in" type="password" name="password" placeholder="password" required="required"><br>
				</p>
				<div class="bottoni">
							<input class="but" type="submit" value="Invia"></div>
			</fieldset></form></div>
	
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