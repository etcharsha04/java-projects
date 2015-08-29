/**
 * 
 */

var x = "abc".constructor;
var str = "This is a test string";
var pos = str.indexOf("test");

var myNum = 128;

console.log("Hex: "+myNum.toString(16));
console.log("Octal: "+myNum.toString(8));
console.log("Binary: "+myNum.toString(2));

document.getElementById("demo").innerHTML = x;

document.getElementById("demo1").innerHTML = x.length;

document.getElementById("demo2").innerHTML = x.prototype;

document.getElementById("demo3").innerHTML = myNum.toString(16);
document.getElementById("demo4").innerHTML = myNum.toString(8);
document.getElementById("demo5").innerHTML = myNum.toString(2);


