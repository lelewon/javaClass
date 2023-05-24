package j0523;

public class Card {
	
	static String[] shape= {"Space","Heart","Diamond","Clover"};
	static String[] numbers= {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String kind; //무늬 - 4가지 Space, Heart, Diamond, Clover
    int number; //숫자 - 1,2,3,4,5,6,7,8,9,10,11-J,12-Q,13-K
	
    Card(){
    	this("Space",1); //다른 생성자 호출
    }
    
    Card(String kind){
    	this.kind = kind; //인스턴스 변수를 가리킴
    }
    
    Card(String kind,int number){
    	this.kind = kind;
    	this.number = number;
    }
    
    @Override //object가 가지고 있는 것 toSt
    public String toString() { //객체 참조변수를 호출하면 str을 돌려줘 라는 뜻
    	String str = kind+","+number;
    	return str;
    }
}
