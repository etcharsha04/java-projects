/**
 * 
 */

var person = {firstName:"Harsha", 
		lastName:"Narayana", 
		eyeColor:"brown"
};

var firstName = person.firstName;
var lastName = person.lastName;
var eyeColor = person.eyeColor;

var text = "Employee Personal Details: "+firstName + " " + lastName + ", with eyeColor " + eyeColor;

function getEmpDetails(){
	document.getElementById("empDetails").innerHTML = text;
}


function getCurrentDate(){
	document.getElementById("date").innerHTML = Date();
}

function backToNormal(){
	document.getElementById("date").innerHTML = 'Click to see current date!!';
}