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
<title>Modifica Prodotto</title>
</head>
<body>
	<%
		String nome=request.getParameter("nome");
		ProdottoDAO pr=new ProdottoDAO();
		ArrayList<Prodotto> p=pr.dammiProdotti(nome);
		int i=0;
	%>
	<div id="log">
		<form  method="post" ACTION="ModificaProdotto?nome=<%=nome %>" id="for">	
			<fieldset id="field">
				<p>
					<font size="15"> modifica il prodotto selezionato: <br><%=nome %><br></font>
				</p>
				<p>
					<b>Descrizione:<input id="in" type="text" name="descrizione" placeholder="<%=p.get(i).getDescrizione()%>" required="required"><br>
					<br> Prezzo:<input id="in" type="number" name="prezzo" placeholder="<%=p.get(i).getPrezzo()%>" required="required"><br>
					<br> Quantit&agrave;:</b><input id="in" type="number" name="quantita" placeholder="<%=p.get(i).getQuantita()%>" required="required"><br>
				</p>
				<%request.setAttribute("nome", nome);%>
				<div class="bottoni">
							<input class="but" type="submit" value="Modifica"></div>
			</fieldset>
			</form>
			</div>


	
</body>
</html>