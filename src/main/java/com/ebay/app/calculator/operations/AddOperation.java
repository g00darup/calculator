package com.ebay.app.calculator.operations;

import com.ebay.app.calculator.Operation;
import org.springframework.stereotype.Component;

@Component
public class AddOperation implements OperationHandler {

    @Override
    public boolean supports(Operation operation) {
        return operation == Operation.ADD;
    }

    @Override
    public Number apply(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}

