package com.arman.basepatterns.behavioral.interpret;

public class OrExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String ctx) {
        return expression1.interpret(ctx) || expression2.interpret(ctx);
    }
}
