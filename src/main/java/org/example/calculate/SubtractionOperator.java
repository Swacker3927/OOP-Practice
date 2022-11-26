package org.example;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return operator.equals("-");
    }

    @Override
    public double calculate(int operand1, int operand2) {
        return operand1 - operand2;
    }
}