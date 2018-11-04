package com.codegym.model;

public class Calculator {
    private float firstOperand;
    private float secondOperand;
    private String operator;

    public Calculator(float firstOperand, float secondOperand, String operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public float getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(float firstOperand) {
        this.firstOperand = firstOperand;
    }

    public float getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(float secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {
        float result = 0;
        switch (this.operator) {
            case "+":
                result = this.firstOperand + this.secondOperand;
                break;
            case "-":
                result = this.firstOperand - this.secondOperand;
                break;
            case "*":
                result = this.firstOperand * this.secondOperand;
                break;
            case "/":
                result = this.firstOperand / this.secondOperand;
                break;
                default:
                    result = 0;

        }
        return result;
    }
}
