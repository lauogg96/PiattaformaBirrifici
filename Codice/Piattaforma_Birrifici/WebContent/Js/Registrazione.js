function ControlloPI()
{
	var pi = document.forms.formReg.email.value;
	
		if	(email=="")
			{
				alert("Partita Iva vuota");
				document.forms.formReg.newpass.value = "";
				return;
			}
		var y = new XMLHttpRequest();
		y.onreadystatechange = function ()
		{
			
			if(this.readyState==4&& this.status==200){
				
				if(y.responseText=="Disponibile")
					{
					flagOk=1;
					
					}
				else
					{
					flagOk=0;
					
					}
			
				document.getElementById("disp").innerHTML = this.responseText; 
			}	
		
		
		};
		y.open("GET", "ControlloEmailAjax.jsp?email="+email, true);
		y.send();
		return true;
}
function ControlloEmail()
{
	var email = document.forms.formReg.email.value;
	
		if	(email=="")
			{
				alert("Email vuota");
				document.forms.formReg.newpass.value = "";
				return;
			}
		var y = new XMLHttpRequest();
		y.onreadystatechange = function ()
		{
			
			if(this.readyState==4&& this.status==200){
				
				if(y.responseText=="Disponibile")
					{
					flagOk=1;
					
					}
				else
					{
					flagOk=0;
					
					}
			
				document.getElementById("disp").innerHTML = this.responseText; 
			}	
		
		
		};
		y.open("GET", "controlloEmailAjax.jsp?email="+email, true);
		y.send();
		return true;
}

function ControlloPassword()
{
	var pass = document.forms.formReg.newpass.value;
	
		if((pass.length <8) && (pass.length<21))
			{
				alert("Password almeno di 8 caratteri e massimo 20");
				document.forms.formReg.newpass.value = "";
				return;
			}
}