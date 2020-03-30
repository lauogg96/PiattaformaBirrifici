<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
	<link rel="icon" href="Foto/Logo.png">
<title>Non solo birra</title>
</head>
<body>
<div id="errore">
			<br><p align="center">ERRORE</p><br>
		<%
			String email = (String) session.getAttribute("email");
			session.setAttribute("email",email);
			String pi = (String) session.getAttribute("pi");
			session.setAttribute("pi",pi);
			
			String boh =(String) request.getAttribute("pass");
			String qua=request.getParameter("quantita");
			String pii=(String)request.getAttribute("pii");
			String failAggiungi=(String)request.getAttribute("failAggiungi");
			String nome=(String)request.getAttribute("nome");
			String cerca=(String)request.getAttribute("cerca");
			String noProd=(String)request.getAttribute("noProd");
			String noOrdini=(String)request.getAttribute("noOrdini");
			String ordiniVend=(String)request.getAttribute("ordiniVend");
			String failLogin=(String)request.getAttribute("failLogin");
			String failVend=(String)request.getAttribute("failVend");
			String failReg=(String)request.getAttribute("failReg");
			String failRegVend=(String)request.getAttribute("failRegVend");
			String failModifica=(String)request.getAttribute("failModifica");
			String failCerca=(String)request.getAttribute("failCerca");
			
			if(failModifica!=null){
				if(failModifica.equals("quantita")){%>
					La quantità inserita non è valida
				<%}
				if(failModifica.equals("descrizione")){%>
					La descrizione inserita non è valida
				<%}
				if(failModifica.equals("prezzo")){%>
					Il prezzo inserito non è valido
				<%}
			}
			
			if(failCerca!=null){%>
				La ricerca non può essere effettuata
			<%}
			
			if(failAggiungi!=null){
				if(failAggiungi.equals("nome")){%>
					Il nome inserito non è valido!
				<%}
				else if(failAggiungi.equals("colore")){%>
					Il colore non è valido
				<%}
				else if(failAggiungi.equals("gradazione")){%>
				La gradazione non è valida
				<%}
				else if(failAggiungi.equals("descrizione")){%>
				La descrizione non è valida
				<%}
				else if(failAggiungi.equals("quantita")){%>
				La quantita non è valida
				<%}
				else if(failAggiungi.equals("prezzo")){%>
				Il prezzo non è valido
				<%}
			}
			
			if(failRegVend!=null){
				if(failRegVend.equals("piInUso")){%>
					La partita IVA inserita è già in uso!
				<%}
				else if(failRegVend.equals("formatoPi")){%>
					La partita IVA non rispetta il formato!
				<%}
				else if(failRegVend.equals("formatoRS")){%>
				La ragione sociale non rispetta il formato!
				<%}
				else if(failRegVend.equals("errIndirizzo")){%>
				L'indirizzo non rispetta il formato!
				<%}
				else if(failRegVend.equals("passForm")){%>
				La password non rispetta il formato
				<%}
				else if(failRegVend.equals("errMail")){%>
				La mail non rispetta il formato
				<%}
			}
			
			if(failReg!=null){
				if(failReg.equals("lungo")){%>
					Il nome inserito è troppo lungo
				<%}
				else if(failReg.equals("errFormat")){%>
					Il nome non rispetta il formato
				<%}
				else if(failReg.equals("errCognome")){%>
					Il cognome non rispetta il formato
				<%}
				else if(failReg.equals("errIndirizzo")){%>
					L'indirizzo inserito non rispetta il formato
				<%}
				else if(failReg.equals("errTel")){%>
				Il numero di telefono inserito non rispetta il formato
			<%}
				else if(failReg.equals("errMail")){%>
				La mail non rispetta il formato
			<%}
				else if(failReg.equals("email")){%>
			La mail è già in uso!
		<%}
			
				
		else if(failReg.equals("passForm")){%>
			La password non rispetta il formato
		<%}
			}
			
			if(failVend!=null){
				if(failVend.equals("noPass")){%>
					La password inserita non corrisponde alla tua partita IVA!
				<%}
				else{%>
					La Partita IVA inserita non è corretta!
				<%}
				
			}
			
			if(failLogin!=null){
				if(failLogin.equals("noEmail")){%>
					L'email inserita non è valida!
				<%}
				else{%>
					La password inserita non corrisponde alla tua mail!
				<%}
			}
			
			if(ordiniVend!=null){%>
				Non hai ancora ricevuto ordini!
			<%}			
			
			if(noOrdini!=null){%>
				Non hai ancora effettuato ordini
			<%}
			
			if(noProd!=null){%>
				Non hai ancora inserito prodotti!
			<%}
			if(cerca!=null){%>
				Non ci sono prodotti per la ricerca: <%=cerca%>
			<%}
			
			if(nome!=null){
				%>
				Il nome: <%=nome %> appartiene già ad un altro prodotto
				<%
			}
			
			if(qua!=null){
				int quantita=Integer.parseInt(qua);
				if (quantita==0){
					%>
					Non hai selezionato la quantità!
				<%}
					
				else if(quantita>0){
					%>
					Mi dispiace la quantità selezionata è maggiore della quantità disponibile
				<%}
				else if(quantita<0){
					%>
					Mi dispiace la quantità selezionata è minore di 0!
				<%}
			}
			
			
			if(pii!=null){
				%>
				La quantità nel tuo carrello non è più disponibile!
			<%}
			
			String corta="corta";
			String lunga ="lunga";
			 if (boh!=null)
				{
					if(boh.equals(corta)){%>
				Mi dispiace password corta
				<%}
					if(boh.equals(lunga)){%>
				Mi dispiace password troppo lunga
			<% }
					} 
			%>
	</div>
</body>
</html>