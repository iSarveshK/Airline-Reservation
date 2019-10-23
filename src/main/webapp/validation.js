function validateRegistrationForm()
{
	var re=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{6,}$/;
	
	var firstpassword=document.registrationForm.fpassword.value;  
	var secondpassword=document.registrationForm.spassword.value;  
	
if((document.registrationForm.firstName.value).length<3){
		alert("Enter valid first name");
		return false;
		}
	


if((document.registrationForm.lastName.value).length<3){
	alert("Enter valid Last name");
	return false;
	}


if((document.registrationForm.password.value)!=re)
	{
		alert("Enter a valid Password");
	return false;
     }
	
if((document.registrationForm.phone.value)<10)
		{
	alert("Enter a valid Phone Number");
	return false;
		}
	

	  
	if(firstpassword==secondpassword){  
	return true;  
	}  
	else{  
	alert("password must be same!");  
	return false;  
}
}
	

