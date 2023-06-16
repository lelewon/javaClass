/**
 * 시간 가져오기
 */
let aaa = 0; //변수
var a = 0; //변수
const bbb = 0; //상수

var interval;

function start(){
	interval = setInterval(function(){
		var today = new Date();
		var hours = today.getHours();
		var minutes = today.getMinutes();
		
		var minutes2;
		if(minutes<10) minutes2 = "0"+minutes;
		else minutes2 = minutes;
		
		var seconds = today.getSeconds();
		var seconds2 =0;
		if(seconds<10) seconds2 = "0"+seconds;
		else seconds2 = seconds;
		var milliseconds = today.getMilliseconds();
		document.getElementById("h01").innerText = hours+":"+minutes2+":"+seconds2;
	},1000);
}