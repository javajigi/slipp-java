package net.slipp.extend;

public class Tea extends CaffeineBeverage {
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public void brew() {
		System.out.println("티백을 담근다.");
	}

	public void addCondiments() {
		System.out.println("레몬을 추가한다.");
	}
}
