package oop1130;

public class InterfaceTest3 {
	public static void main(String[] args) {

		System.out.println("[ JJA - InterfaceTest3 ]"+"\n");
		
	}
}

class Unit {
	int currentHP;
	int x, y;
}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {
	void fight();
}

class Fight extends Unit implements Fightable {		// class 상속 + interface 상속

	@Override
	public void move(int x, int y) {
		;
	}

	@Override
	public void attack(Unit u) {
		;
	}

	@Override
	public void fight() {
		;
	}
	
}

