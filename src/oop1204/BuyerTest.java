package oop1204;

import java.util.*;

public class BuyerTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - BuyerTest ]"+"\n");
		
		// 상품 구매, 반품 프로그램
		
		Product tv=new SmartTV();
		Product note=new Notebook();
		Phone phone=new Phone();
		
		Buyer kim=new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		
		System.out.println("\n구매결과 출력 ");
		kim.summary();
		
		kim.refund(note);
		
		
		
	}
}


class Product {
	public int price;
	public int bonusPoint;
	
	public Product(int price) {
		this.price=price;
		this.bonusPoint=(int)(price*0.1);
	}
	
	public Product() {
		;
	}
	
}


class SmartTV extends Product {

	public SmartTV() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "스마트TV";
	}
	
}

class Notebook extends Product {

	public Notebook() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "노트북";
	}
	
}

class Phone extends Product {

	public Phone() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "스마트폰";
	}
	
}

class Buyer {
	private int money=1000;
	private int mileage=0;
	private Vector<Product> buy=new Vector<Product>();
	
	/*
	public Buyer(int money, int mileage) {
		
	}
	*/
	public Buyer() {
		summary();
	}
	
	// method
	
	public void buy(Product prod) {		// 구매
		System.out.println();
		//System.out.println("잔액:"+getMoney()+" 상품가격:"+prod.price+" 마일리지:"+getMileage()+" 적립예정"+prod.bonusPoint);
		if(prod.price>getMoney()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		else {
			buy.add(prod);
			System.out.println(prod.toString()+" 구매 완료");
			setMoney(getMoney()-prod.price);
			setMileage(getMileage()+prod.bonusPoint);
			summary();
		}
	}
	
	public void refund(Product prod) {		// 반품
		System.out.println();
		if(buy.remove(prod)) {
			System.out.println(prod.toString()+" 반품 완료");
			setMoney(getMoney()-prod.price);
			setMoney(getMileage()+prod.bonusPoint);
			summary();
		}
		else System.out.println("구매 상품이 없습니다.");
	}
	
	public void summary() {		// 구매정보
		String buylist="";
		int sum=0;
		
		
		if(buy.isEmpty()) {
			System.out.println("구매 상품이 없습니다.");
			return;
		}
		for(int i=0;i<buy.size();i++) {
			buylist+=(buy.get(i)+" ");
			sum+=buy.get(i).price;
		}
		
		System.out.println("구매 목록: "+buylist);
		System.out.println("사용 금액: "+sum);
		System.out.println("잔고: "+getMoney());
		System.out.println("마일리지: "+getMileage());
	}
	
	// getter&setter
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}






