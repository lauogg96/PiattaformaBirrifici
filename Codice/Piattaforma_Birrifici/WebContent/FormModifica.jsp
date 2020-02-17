<%@page import="Model.AcquirenteDAO"%>
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
<title>Modifica Account</title>
</head>
<body>
<%
	String email = (String) session.getAttribute("email");
	session.setAttribute("email",email);
%>
<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
	<div id="log">
		<form  method="post" ACTION="ModificaProfilo?email=<%=email %>" id="for">	
			<fieldset id="field">
				<p>
					<font size="15"> Modifica i tuoi dati<br></font>
				</p>
				<p>
				<%try{
					AcquirenteDAO ac=new AcquirenteDAO();
					ArrayList<Acquirente> lista=ac.ListAcquirenti();				
					for(int i=0;i<lista.size();i++){
						if(lista.get(i).getEmail().equals(email)){
				%>
					
					<br> Password:<input id="in" type="password" name="password" value=<%=lista.get(i).getPassword()%> required="required"><br>
					<br> Indirizzo:</b><input id="in" type="text" name="indirizzo" required="required"><br>
					<br><b>Telefono:<input id="in" type="text" name="tel" value=<%=lista.get(i).getNumTelefono()%> required="required"><br>
				</p>
				<div class="bottoni">
							<input class="but" type="submit" value="Invia"></div>
			</fieldset>
			</form>
			<%}}}catch(Exception e){
				e.printStackTrace();
			} %>
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