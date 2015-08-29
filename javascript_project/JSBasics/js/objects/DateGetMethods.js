/**
 * 
 */

var today = new Date();
var date = today.getDate();
var day = today.getDay();
var fullYear = today.getFullYear();
var month = today.getMonth();
var hours = today.getHours();
var minutes = today.getMinutes();
var seconds = today.getSeconds();
var milliseconds = today.getMilliseconds();
var parse = Date.parse(today);
var pastTime = new Date(parse);

function displayToday(){
	document.getElementById("today").innerHTML = "Today: "+today;
	document.getElementById("date").innerHTML = "Date: "+date;
	document.getElementById("day").innerHTML = "Day: "+day;
	document.getElementById("fullYear").innerHTML = "Full Year: "+fullYear;
	document.getElementById("month").innerHTML = "Month: "+month;
	document.getElementById("hours").innerHTML = "Hours: "+hours;
	document.getElementById("minutes").innerHTML = "Minutes: "+minutes;
	document.getElementById("seconds").innerHTML = "Seconds: "+seconds;
	document.getElementById("milliseconds").innerHTML = "Milliseconds: "+milliseconds;
	document.getElementById("parse").innerHTML = "Parsed Milliseconds: "+parse;
	document.getElementById("pastTime").innerHTML = "Parsed Milliseconds: "+pastTime;
	
}