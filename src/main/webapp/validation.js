function validateRegistrationForm()
{
	var re=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])\w{6,}$/;
	
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

}