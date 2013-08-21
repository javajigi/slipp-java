package net.slipp.jvm;

public class Calculator {
    int add(int i, int j) {
    	i = 5;
    	j = 3;
        return i + j;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int i = 3;
        int j = 2;
        System.out.println("before i : " + i);
        System.out.println("before j : " + j);
        calculator.add(i, j);
        System.out.println("after i : " + i);
        System.out.println("after j : " + j);        
    }
}