package org.example;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    double calculate(int operand1, int operand2);
}
