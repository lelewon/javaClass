/**
 * 랜덤함수
 */
//let,const(상수),var
 var random = Math.floor(Math.random()*2)+1; //1-100, 숫자형
 
 var input = Number(prompt("1-100까지 숫자를 입력하세요"));
 
 if(input===random){ // == 일때 타입이 달라도 비교해줌 1=="1" :같음, 1==="1" 다름(타입까지 같아야함)
	 document.write("정답입니다. 정답 : ",random);
 }else{
	 alert("오답입니다. 정답 : "+random);
	 //document.write("오답입니다. 정답 : ",random)
	 location.reload();
 }