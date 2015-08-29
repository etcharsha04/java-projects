/**
 * 
 */

var fruits = [ "Mango", "Grapes", "Banana", "Apple" ];

function displayFruits() {
	document.getElementById("fruits").innerHTML = "Fruits: " + fruits;
	document.getElementById("arrayLength").innerHTML = "Array Length : "
			+ fruits.length;
	document.getElementById("firstElement").innerHTML = "First Element (fruits[0]): "
			+ fruits[0];
	document.getElementById("secondElement").innerHTML = "Second Element (fruits[1]): "
			+ fruits[1];
	document.getElementById("thirdElement").innerHTML = "Third Element (fruits[2]): "
			+ fruits[2];
	document.getElementById("fourthElement").innerHTML = "Fourth Element (fruits[3]): "
			+ fruits[3];

	for (var index = 0; index < fruits.length; index++) {
		document.getElementById(index).innerHTML = fruits[index];
	}

	isArray(fruits);
}

function isArray(myArray) {
	document.getElementById("isArray").innerHTML = "Is Array: "
			+ (myArray.constructor.toString().indexOf("Array") > -1);
}