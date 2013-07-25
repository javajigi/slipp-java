package net.slipp.inheritance;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }

    private void pourInCup() {
        System.out.println("컵에 붓는다.");
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}