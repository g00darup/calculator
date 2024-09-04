package com.ebay.app.calculator.operations;

import com.ebay.app.calculator.Operation;

public interface OperationHandler {
    boolean supports(Operation operation);
    Number apply(Number num1, Number num2);
}
