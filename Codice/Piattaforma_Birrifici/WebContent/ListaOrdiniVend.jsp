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
<title>I tuoi Ordini</title>
</head>
<body>
<%
	String pi = (String) session.getAttribute("pi");
	session.setAttribute("pi",pi);
%>
<div>
		<img class="logo" src="Foto/Logo.png">
	</div>
<p style="color:gold; margin-left:37%; font-size:150%">Ecco i tuoi ordini <%=pi %></p>
<div id="carr">
	<table id="tabcar" >
	
		<tr>
			
			<td width="16%">NOME</td>
			<td width="16%">PREZZO</td>
			<td width="16%">QUANTIT&Agrave;</td>
			<td width="16%">TOTALE</td>
			<td width="16%">STATO DELL'ORDINE</td>
			<td width="16%">CAMBIA STATO</td>
		</tr>
	<%try{
		OrdineDAO or=new OrdineDAO();
		ArrayList<Ordine> lista=or.dammiOrdine();
		int cont=0;
		for(int i=0;i<lista.size();i++){
				
				ProdottoDAO p=new ProdottoDAO();
				ArrayList<Prodotto> pr=p.dammiProdotti(lista.get(i).getProdottoOr());
				
				AcquirenteDAO ac=new AcquirenteDAO();
				ArrayList<Acquirente> list=ac.ListAcquirenti();
				for(int j=0;j<list.size();j++){
				if(pr.get(0).getVenditore().equals(pi)&&list.get(j).getEmail().equals(lista.get(i).getAcquirenteOr())){
					cont++;
	%>	
	<tr>
					
					<td ><%=lista.get(i).getProdottoOr()%></td>
					<td ><%=pr.get(0).getPrezzo() %> &euro;/cad</td>
					<td ><%=lista.get(i).getQuantita() %></td>
					<td ><%=lista.get(i).getPrezzo() %> &euro;</td>
					<td><%=lista.get(i).getStato() %></td>
					<td><form action="CambioStato?cod=<%=lista.get(i).getCod_ordine() %>&pi=<%=pi %>" method="post">
			<select name="stato" required="required" id="sel">
				<option value="In Elaborazione">In Elaborazione</option>
				<option value="In Consegna">In Consegna</option>
				<option value="Consegnato">Consegnato</option>
			</select></td>
			<td><input class="but" type="submit" value="Cambia Stato"></td>
			</form>
			<td><div class="bottoni"><button class="but" onclick="document.getElementById('<%=lista.get(i).getCod_ordine()%>').style.display='block'" >Dettagli</button></div>
					</tr>
				</tr>	
				
				 <div id="<%=lista.get(i).getCod_ordine()%>" class="modal">
  			<span onclick="document.getElementById('<%=lista.get(i).getCod_ordine()%>').style.display='none'" class="close" title="Close Modal" style="color: gold;">&times;</span>
								
			<p style="color:gold;margin-left:40%; font-size:200% ">Dettagli ordine</p>						
			 
			<nav style="margin-left:35%">
			<ul >
			 <li style="padding-bottom: 3%;">Codice Ordine:: <%=lista.get(i).getCod_ordine()%></li><br>
			 <li style="padding-bottom: 3%;">Nome prodotto: <%=pr.get(0).getNome()%></li><br>
			 <li style="padding-bottom: 3%;">Nome acquirente: <%=list.get(j).getNome()%></li><br>
			 <li style="padding-bottom: 3%;">Cognome acquirente:  <%=list.get(j).getCognome()%></li><br>
		 	 <li style="padding-bottom: 3%;">Indirizzo di spedizione:  <%=list.get(j).getIndirizzo()%></li><br>
			 <li style="padding-bottom: 3%;">Numero di telefono:  <%=list.get(j).getNumTelefono()%></li><br>
			 <li style="padding-bottom: 3%;">Quantit&agrave;:  <%=lista.get(i).getQuantita() %></li><br>
			 <li style="padding-bottom: 3%;">Prezzo: <%=lista.get(i).getPrezzo()%>&euro; </li><br>
			</ul>
			</nav>
			 </div>
	<%}}}
	if(cont==0){
		request.setAttribute("ordiniVend", "ordini");
		RequestDispatcher view =  request.getRequestDispatcher("errore.jsp");
		view.forward(request, response);
	}	
	}catch(Exception e){
		e.printStackTrace();
	} %>
	</table>
	</div>
</body>
</html>