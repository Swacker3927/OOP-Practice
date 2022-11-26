package org.example.calculate;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return operator.equals("/");
    }

    @Override
    public double calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toDouble() / operand2.toDouble();
    }
}
