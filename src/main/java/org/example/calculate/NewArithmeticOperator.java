package org.example.calculate;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    double calculate(PositiveNumber operand1, PositiveNumber operand2);
}
