package com.arman.basepatterns.behavioral.interpret;

public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String ctx) {
        return ctx.contains(data);
    }
}
