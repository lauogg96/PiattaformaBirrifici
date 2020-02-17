<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<title>Area Account</title>
</head>
<body>
<%
		String pi = (String) session.getAttribute("pi");
		session.setAttribute("pi",pi);
	
	%>
	<div>
	<b id="ben"> Benvenuto:
	<%
		out.print(pi);
	%><br><br><br>
	<a href="LogoutVenditore?email=<%= pi %>">Logout</a><br>
	</b>
	
		<img class="logo" src="Foto/Logo.png">
	</div>
	
		<div id="carr">
				<table id="tabcar">
					<tr>
						<td>
							<a href="AggiungiProdottoView.jsp"><img src="Bottoni/aggiungi.png" width="50%"></a>
						</td>
						<td>
							<a href="ListaProdottiVend?p=<%=pi%>"><img src="Bottoni/modifica.png" width="50%"></a>
						</td>
						<td>
							<a href="OrdiniVend?pi=<%=pi%>"><img src="Bottoni/occhio.png" width="50%"></a>
						</td>
					</tr>
					<tr>
						<td>
							<a href="AggiungiProdottoView.jsp">Aggiungi Prodotto</a>
						</td>
						<td>
							<a href="ListaProdottiVend?p=<%=pi%>">Visualizza prodotti</a>
						</td>
						<td>
							<a href="Ordini?p=<%=pi%>">Visualizza Ordini</a>
						</td>
					</tr>
				</table>
		</div>


	<div id="footer">
		<table class="footer">
			<tr>
				<td><a href="ChiSiamo.jsp">Chi Siamo</a></td>
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