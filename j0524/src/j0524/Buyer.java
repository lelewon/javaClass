package j0524;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
	//Product p = new Stv();
	//Product p = new Computer();
	//Product p = new Audio();
	int count = 0;
	void buy(Product p) {
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] = p;
		count++;
	}
	
	
	
//	// Stv s = new Stv();
//	void buy(Stv s) {
//		money = money - s.price; //150
//		bonusPoint = bonusPoint + s.bonusPoint;
//		
//	}
//	
//	void buy(Computer c) {
//		money = money - c.price; //200
//		bonusPoint = bonusPoint + c.bonusPoint;
//		
//	}
//	
//	void buy(Audio a) {
//		money = money - a.price; //50
//		bonusPoint = bonusPoint + a.bonusPoint;
//		
//	}
	
}
