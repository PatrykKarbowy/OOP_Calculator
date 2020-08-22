package com.calculatoroop;

import java.util.Scanner;

public class CalculatorTasks {
    private int x;
    private int y;
    private int result;
    private char operator;

    public void readTask(){
        Scanner read = new Scanner(System.in);
        System.out.println("Input 1 number: ");
        this.x = read.nextInt();
        System.out.println("Input 2 number: ");
        this.y = read.nextInt();
        System.out.println("Choose an operator from ( +, -, *, / ): ");
        this.operator = read.next().charAt(0);
    }
    public void calculate(){
        switch (operator) {
            case '+' -> this.result = this.x + this.y;
            case '-' -> this.result = this.x - this.y;
            case '*' -> this.result = this.x * this.y;
            case '/' -> this.result = this.x / this.y;
        }
    }
    public void printResult(){
        System.out.println(result);
    }
}
