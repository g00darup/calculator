package com.ebay.app.calculator.operations;

import com.ebay.app.calculator.Operation;
import org.springframework.stereotype.Component;

@Component
public class DivideOperation implements OperationHandler {

    @Override
    public boolean supports(Operation operation) {
        return operation == Operation.DIVIDE;
    }

    @Override
    public Number apply(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}

