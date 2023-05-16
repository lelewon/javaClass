package j0516;

public class Tv { //클래스 바로 밑에 있는 클래스 변수는 디폴트로 값이 들어가있다.
	              //int=0, boolean=False, String=Null
	//메소드 내에 있는 변수(지역변수)는 값을 안넣어주면 에러난다.
	String color;
	boolean power;
	int channel;
	int volume;
	
	
	void power() {
		power = !power;
	}
	void channelUp() {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
	}
	void channelDown() {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}
	void volumeUp() {
		if(volume>=100) {
			volume=100;
			System.out.println("볼륨은 100이상으로는 올라가지 않습니다.");
			return;
		}
		volume++;
	}
	void volumeDown() {
		if(volume<=0) {
			volume=0;
			System.out.println("볼륨은 0이하로는 내려가지 않습니다.");
			return;
		}
		volume--;
	}

}
