<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<title>Ordini e Spedizioni</title>
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
		<nav class="login" style="margin-right:11%;">
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
	
			<p class="inf">COMPRARE ONLINE: il nostro servizio di vendita	</p>
			<hr size="6%" color="gold" >
			
			<div id="Ord">
				
					<p class="Ord" ><strong class="Ord1"><br><br>ORDINE MINIMO</strong><br><b>6 bottiglie</b> miste <br>(o suoi multipli)<br></p>
			
			</div>		
			<div id="Ord3">
				
					<p class="Ord"><strong class="Ord1"><br> COSTI DI SPEDIZIONE </strong><br><b>&euro; 10 (IVA inclusa) </b> in tutta Italia <br> Con preavviso telefonico gratuito per la consegna su <br>appuntamento.</p>
			</div>	
			<div id="Ord1">
			
					<p class="Ordd" ><strong class="Ord1"> PAGAMENTI </strong><br>Concludi i tuoi acquisti con il metodo di pagamento <br>che preferisci:<br><b>bonifico/carte di credito/PayPal
						<br>contrassegno (+ &euro;3,90)</b><br></p>
			</div>	
			<br>
			<div id="Ord2">
				
					<p class="Ordd"><strong class="Ord1"><br>SPEDIZIONE GRATUITA  </strong><br><b>Da &euro; 100 (IVA inclusa) </b> <br>di spesa </p>
			</div>	
			<br><br><br>
			
				
			<div id="Sped">
					
					<p class="Ord"><strong class="Ord1"> EVASIONE ORDINI </strong><br>CC/PayPal o contrassegno:<br><b> 24h dall'ordine</b><br> Bonifico:<br><b> 24h dall'accredito</b></p>
					
			</div>	
			<br>
			<div id="Sped1">
					
					<p class="Ord"><strong class="Ord1">  TEMPI DI CONSEGNA </strong><br><b>2/4 giorni lavorativi</b> per consegne nel Nord e <br>Centro Italia.<br><b>3/6 giorni lavorativi</b> per consegne in Calabria,<br>Sicilia, Sardegna, Laguna di Venezia, isole minori e<br>localita&grave; di montagna</p>
			</div>
			
			<div id="Sped2">
						
					<p class="Ordd"><strong class="Ord1"> IMBALLO</strong><br>Cartoni dedicati a:<br><b> tripla onda</b></p>
					
			</div>	
			<br>
			<div id="Sped3">
						
					<p class="Ordd"><strong class="Ord1"> CORRIERE</strong><br>Spedizioni tracciate e consegna su appuntamento <br>senza costi aggiuntivi con corriere.</p>
					
			</div>	
			<br><br><br><br><br><br><br><br>	
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