/**
 * for문
 */
/*// 입력한 숫자까지 합을 구하시오
// 50 1-50, 10 1-10까지
var input = Number(prompt("1-100까지 숫자를 입력하세요"));

var sum = 0;
for(var i=1;i<=input;i++){
	if(i%2==1){
		sum += i;
	}
}

document.write("입력한 숫자까지의 홀수 숫자 합 : ",sum);
document.write("<br>");*/



// 입력한 숫자까지 합을 구하시오
// 50 1-50, 10 1-10까지
var input = Number(prompt("처음 숫자를 입력하세요","0"));
var input2 = Number(prompt("마지막 숫자를 입력하세요"));
//1,100 100,1
//Math.min(), Math.max()
//var num, var num2

/*var num = Math.min(input,input2);
var num2 = Math.max(input,input2);*/

num = (input<input2)?input:input2;
num2 = (input>input2)?input:input2;

var sum = 0;
for(var i=num;i<=num2;i++){
	sum += i;
}

document.write("입력한 숫자까지의 숫자 합 : ",sum);
document.write("<br>");



/*// 입력한 숫자까지 합을 구하시오
// 50 1-50, 10 1-10까지
var input = Number(prompt("1-100까지 숫자를 입력하세요"));

var sum = 0;
for(var i=1;i<=input;i++){
	sum += i;
}

document.write("입력한 숫자까지의 숫자 합 : ",sum);*/


/*var sum = 0;
for(var i=1;i<=100;i++){
	sum += i;
}

document.write("1-100까지의 숫자 합 : ",sum);*/