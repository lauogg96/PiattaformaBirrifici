<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<title>Info Privacy</title>
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
		<nav style="margin-right:11%;" class="login">
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
	<%	}
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
<div id="infoPrivacy">
<h3 align="center">INFORMATIVA SUL TRATTAMENTO DEI DATI PERSONALI</h3><br>
Informativa resa ai sensi del Dlgs del 30.06.2003 "CODICE DELLA PRIVACY"<br>

Ai sensi dell'art. 13, Dlgs 30 giugno 2003 nr. 196, INFORMIAMO che la nostra piattaforma SUNRISE tratta dati personali di clienti e fornitori e di soggetti che comunicano volontariamente (con registrazione o via e-mail) i loro dati anagrafici al nostro ufficio commerciale o alla nostra direzione aziendale.
<br>
La nostra societ&agrave; garantisce nell'ambito delle previsioni normative che il trattamento dei dati personali si svolge nel rispetto dei diritti e delle libert&agrave; fondamentali, nonch&egrave; della dignit&agrave; dell'interessato, con particolare riferimento alla riservatezza, all'identit&agrave; personale e al diritto alla protezione dei dati personali.
<br>
Finalit&agrave; del trattamento:<br>
<ol>
<li>adempiere agli obblighi di legge, dai regolamenti, dalla normativa comunitaria, da norme civilistiche e fiscali</li>
<li>adempiere agli eventuali obblighi contrattuali nei confronti del interessato</li>
<li>adempiere ad attivit&agrave; connesse all'attivit&agrave; economica della nostra societ&agrave;, come compilazione delle anagrafiche e statistiche interne, per la fatturazione, la tenuta della contablit&agrave; clienti-fornitori</li>
<li>finalit&agrave; di tipo commerciale, come invio di  informazioni commerciali e materiale pubblicitario (via posta ed e-mail), di marketing e ricerche di mercato</li>
<li>la tutela dei crediti e la gestione dei debiti</li>
<li>finalit&agrave; assicurative, in particolare per assicurazioni crediti</li>
</ol>

In relazione alle finalit&agrave; di cui sopra i Suoi dati personali verranno comunicati in Italia e/o all'estero se necessario:<br>
<ol >
<li>nostra rete di agenti</li>
<li>professionisti e consulenti</li>
<li>aziende operanti nel settore del trasporto</li>
<li>alle Pubbliche Amministrazioni ed Autorit&agrave;, ove previsto dalla legge</li>
<li>ad Istituti di credito con i quali la ns. ditta ha rapporti per la gestione dei crediti/debiti e l'intermediazione finanziaria</li>
<li>a tutte quelle persone fisiche e/o giuridiche, pubbliche e/o private (studi di consulenza legale, amministrativa e fiscale, uffici giudiziari, Camere di Commercio ecc.), quando la comunicazione risulti necessaria o funzionale allo svolgimento della nostra attivit&agrave; e nei modi e per le finalit&agrave; sopra elencate</li>
</ol>
<br>
I dati personali trattati dalla nostra societ&agrave; non sono soggetti a diffusione.
<br>
Il trattamento potrà effettuarsi con o senza l'ausilio di mezzi elettronici e comunque automatizzati e comprender&agrave; tutte le operazioni previste all'art. 4 comma 1, lettera a, Dlgs 30 giugno 2003 nr. 196 e necessarie al trattamento in questione. Comunque il trattamento sar&agrave; effettuato nell'osservanza di ogni misura cautelativa, che ne garantisca la sicurezza e la riservatezza.
</div>
<BR>
<br>
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