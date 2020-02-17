<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<title>AggiungiProdotto</title>
</head>
<body>
	<%
	String pi = (String) session.getAttribute("pi");
	session.setAttribute("pi",pi);
		%>
	<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
	<div id="reg">
	<form action="AggiungiProdotto?pi=<%=pi %>" method="post" name="formCat"enctype="multipart/form-data" id="for">
		<fieldset id="field">
		<p> <b>Nome Prodotto: <input id="in" type="text" name="nome" required="required"></b></p>
		<br>
		<p> <b>Colore: <input id="in" type="text" name="colore" required="required"></b></p>
		<br>
		<p> <b>Gradazione: <input id="in" type="number" name="gradazione" required="required"></b></p>
		<br>
		<p> <b>Descrizione: <textarea id="in" name="descrizione" required="required">
		</textarea></b></p>
		<br>
		<p> <b>Quantità: <input id="in" type="number" name="quantitaAgg" required="required"></b></p>
		<br>
		<p> <b>Prezzo: <input id="in" type="number" name="prezzo" required="required"></b></p>
		<br>
		 Foto: <br><br><input id="in" type="file" name="foto" >
						 <br><br><br>
		<input id="bottoneInvia" type="image" name="submit" src="Bottoni/aggiungi_prodotto.png" >
		
	</fieldset>
	</form>
	</div>
</body>
</html>