<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="Css/Smartphone.css" />
<link rel="stylesheet" type="text/css" href="Css/Tablet.css" />
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />

<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>
<script type="text/javascript" src="Js/Registrazione.js"></script>
<script type="text/javascript" src="Js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
$(window).load(function() {
  $('#slider').nivoSlider();
});
</script>
	<link rel="icon" href="Foto/Logo.png">
<title>Piattaforma Birrifici</title>
</head>
<body>
	
			
	<div>
		<img class="logo" src="Foto/Logo.png">
	</div>



		<div id="reg">
			<form action="RegistrazioneAcquirente" method="post" name="formRegAcq" id="for">
				<fieldset id="field">
					<p>
						<font size="15"> Registrazione Acquirente<br></font>
					</p>
					<p>
						<br>E-Mail:<input id="in" type="email" name="e" placeholder="esempio@esempio.it" required="required" > *<font id="disp" size="3px"></font><br>
						<br>Password:<input id="in" type="password" name="p" placeholder="password" required="required" > *<br>
						<br>Nome:<input id="in" type="text" name="n" required="required">*<br>
						<br>Cognome:<input id="in" type="text" name="c" required="required">*<br>
						<br>Indirizzo: <input id="in" type="text" name="i" required="required"> *</b><br>
					</p>
					<br> Telefono:<input id="in" type="text" name="t">
					
		
			

				<p class="c">
					<input id="in" type="checkbox" name="privacy" value="privacy" required="required" ><a href="infoPrivacy.jsp">Accetto le condizioni della privacy</a>
				</p>
				<p>I campi con * sono obbligatori!! 
				
				<div class="bottoni">
				<input class="but" type="submit" value="Invia">
				<input class="but" type="reset" value="Cancella">
				</div>
					</fieldset>			
					
			</form>
		</div>
</body>
</html>