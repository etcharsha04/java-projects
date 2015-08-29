/**
 * 
 */

function addTwoNumbers(p1, p2){
	return p1 + p2;
	
}

function multiplyTwoNumbers(p1, p2){
	return p1 * p2;
}

function divideTwoNumbers(p1, p2){
	if(p1 > p2){
		return p1 / p2;
	}else{
		return p2 / p1;
	}
}

function moduloOfTwoNumbers(p1, p2){
	return p1 % p2;
}

function subtractTwoNumbers(p1, p2){
	return p1 - p2;
}

var x = 2, 
y = 3;

var sum = addTwoNumbers(x, y);
var result = multiplyTwoNumbers(x, y);
var result1 = divideTwoNumbers(y, x);
var result2 = moduloOfTwoNumbers(y, x);
var result3 = subtractTwoNumbers(y, x);

document.getElementById("sum").innerHTML = "Sum of " + x + ", " + y + " = " + (sum) + "\n";
document.getElementById("mulResult").innerHTML = ", Multiplication of "+ x + ", " + y +  " = " + (result) + "\n";
document.getElementById("divResult").innerHTML = ", Division of " + x + ", " + y + " = " +  (result1) + "\n";
document.getElementById("modResult").innerHTML = ", Modulus of " + x + ", " + y + " = " +  (result2) + "\n";
document.getElementById("subResult").innerHTML = ", Subtraction of " + x + ", " + y + " = " +  (result3) + "\n";


