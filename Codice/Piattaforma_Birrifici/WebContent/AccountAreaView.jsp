<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import=" Model.*" %>
	<%@page	import="java.util.*"%>
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
		String email = (String) session.getAttribute("email");
		session.setAttribute("email",email);
	%>
	<div>
	<b id="ben"> Benvenuto:
	<%
		out.print(email);
	%><br><br><br>
	<a href="LogoutVenditore?email=<%= email %>">Logout</a><br>
	</b>
	
		<img class="logo" src="Foto/Logo.png">
	</div>
	<%try{
		AcquirenteDAO a=new AcquirenteDAO();
		ArrayList<Acquirente> lista=a.ListAcquirenti();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getEmail().equals(email)){
	%>
	<div>
	<b style="color:gold; margin-left:10%; font-size:150% " >I tuoi dati<br>
	<b style="color:gold; margin-left:5%" >Email: <%=email %></b><br>
	<b style="color:gold; margin-left:5%" >Nome: <%=lista.get(i).getNome() %></b><br>
	<b style="color:gold; margin-left:5%" >Cognome: <%=lista.get(i).getCognome() %></b><br>
	<b style="color:gold; margin-left:5%" >Indirizzo: <%=lista.get(i).getIndirizzo() %></b><br>
	<%
		if(lista.get(i).getNumTelefono().equals("")){
			%>
		<b style="color:gold; margin-left:5%" >Non hai inserito un numero di telefono
		</b></b>
		<%}
		else{ 
		%>
		<b style="color:gold; margin-left:5%" >Telefono: <%=lista.get(i).getNumTelefono() %></b>
	</div>
	<%}}}}catch(Exception e){
		e.printStackTrace();
	} %>
		<div id="carr">
				<table id="tabcar">
					<tr>
						<td>
							<a href="VediCarrello?email=<%=email%>">Il tuo carrello</a>
						</td>
						<td>
							<a href="Ordini?email=<%=email%>">I tuoi ordini</a>
						</td>
						<td>
							<a href="ModificaDati?email=<%=email%>">Modifica dati</a>
						</td>
					</tr>
					<tr>
						<td>
							<a href="VediCarrello?email=<%=email%>">Visualizza Carrello</a>
						</td>
						<td>
							<a href="Ordini?email=<%=email%>">Visualizza Ordini</a>
						</td>
						<td>
							<a  href="ModificaDati?email=<%=email%>">Modifica Account</a>
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