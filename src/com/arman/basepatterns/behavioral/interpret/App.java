package com.arman.basepatterns.behavioral.interpret;

public class App {
     public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();
        System.out.println(isJava.interpret("java"));
        System.out.println( isJavaEE.interpret("spring java"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaEE = new TerminalExpression("spring");
        return new AndExpression(java, javaEE);
    }
}
