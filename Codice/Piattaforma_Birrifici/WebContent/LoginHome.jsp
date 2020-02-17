<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Home</title>
</head>
<link rel="stylesheet" type="text/css" href="CSS/Computer.css" />
<script type="text/javascript" src="Js/jquery-1.4.3.min.js"></script>

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
	<a href="LogoutAcquirente?email=<%= email %>">Logout</a><br>
	</b>
	<div class="container">
		<nav class="login" style="margin-right:11%;">
		<ul>
			<li class="slidesotto"><a style="font-size: 20px" href="AccountAreaView.jsp">Account Area</a>
				<ul class="nascosto">
					<li><a style="font-size: 15px" href="VediCarrello?email=<%=email%>">Carrello</a></li>
					<li><a style="font-size: 15px"href="Ordini?email=<%=email%>">I miei ordini</a></li>
					<li><a style="font-size: 15px" href="ModificaDati?email=<%=email%>">Modifica Dati</a></li>
				</ul>
			</li>
			</ul>
		</nav>
</div>
		<img class="logo" src="Foto/Logo.png">
	</div>
<div style="margin-left:41%;">
<form action="Cerca" method="post" name="cerca" id="cerca">
	<b>Cerca:<input id="cerca" type="text" name="cerca" required="required"> 
	
		<input class="butCerca" type="submit" value="Invia"></b>
	
	</form>
	</div>
		
	
	<script type="text/javascript">
	var i=0;
	var image=[];
	var time = 3000;
	
	image[0]='Sli/1.png';
	image[1]='Sli/10.png';
	image[2]='Sli/11.png';
	image[3]='Sli/12.png';
	image[4]='Sli/13.png';
	image[5]='Sli/14.png';
	image[6]='Sli/2.png';
	image[7]='Sli/3.png';
	image[8]='Sli/4.png';
	image[9]='Sli/5.png';
	image[10]='Sli/6.png';
	image[11]='Sli/7.png';
	image[12]='Sli/8.png';
	image[13]='Sli/9.png';
	
	function changeImg(){
		document.slide.src=image[i];
		if(i<image.length-1){
			i++;
		}
		else{
			i=0;
		}
		setTimeout("changeImg()",time)
	}
	window.onload=changeImg;
</script>

<img class="slider" name="slide" >
			
	
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