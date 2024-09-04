package com.ebay.app.calculator;

import com.ebay.app.calculator.exceptions.UnsupportedOperationException;
import com.ebay.app.calculator.operations.OperationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Calculator {

    private final List<OperationHandler> handlers;

    @Autowired
    public Calculator(List<OperationHandler> handlers) {
        this.handlers = handlers;
    }

    public Number calculate(Operation op, Number num1, Number num2) {
        for (OperationHandler handler : handlers) {
            if (handler.supports(op)) {
                return handler.apply(num1, num2);
            }
        }
        throw new UnsupportedOperationException("Operation not supported: " + op);
    }

    public Number chainCalculate(Number initial, List<Operation> operations, List<Number> numbers) {
        Number result = initial;
        for (int i = 0; i < operations.size(); i++) {
            result = calculate(operations.get(i), result, numbers.get(i));
        }
        return result;
    }
}
