package com.arman.basepatterns.behavioral.interpret;

import java.util.List;

public class AndExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String ctx) {
        return expression1.interpret(ctx) && expression2.interpret(ctx);
    }
}
