/**
 * 
 */

var date = new Date();
var zeroTime = new Date(86400000);
var birthDay = new Date(2009, 04, 22, 18, 49, 0, 0);
var birthday = new Date(2009, 04, 22);

function displayDate() {
	document.getElementById("today").innerHTML = "Today: " + date;
	document.getElementById("zeroTime").innerHTML = "Zero Time: " + zeroTime;
	document.getElementById("birthday").innerHTML = "Birthday : " + birthDay;
	document.getElementById("varBirthday").innerHTML = "Variant Birthday: "
			+ birthday;

	document.getElementById("utcToday").innerHTML = "UTC Today: "
			+ date.toUTCString();
	document.getElementById("utcZeroTime").innerHTML = "UTC Zero Time: "
			+ zeroTime.toUTCString();
	document.getElementById("utcBirthday").innerHTML = "UTC Birthday : "
			+ birthDay.toUTCString();
	document.getElementById("utcVarBirthday").innerHTML = "UTC Variant Birthday: "
			+ birthday.toUTCString();

	document.getElementById("readableToday").innerHTML = "Readable Today: "
			+ date.toDateString();
	document.getElementById("readableZeroTime").innerHTML = "Readable Zero Time: "
			+ zeroTime.toDateString();
	document.getElementById("readableBirthday").innerHTML = "Readable Birthday : "
			+ birthDay.toDateString();
	document.getElementById("readableVarBirthday").innerHTML = "Readable Variant Birthday: "
			+ birthday.toDateString();
	
}