package net.slipp.jvm;

public class Adder2 {
    private int i;
    private int j;

    Adder2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int add() {
        return i + j;
    }

    public static void main(String[] args) {
    	Adder2 adder = new Adder2(5, 2);
        int result = adder.add();
        System.out.println(result);
    }
}