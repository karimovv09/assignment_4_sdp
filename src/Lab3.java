// Lab3.java
class Lab3 {

    interface Expression {
        boolean interpret(String context);
    }

    static class TerminalExpression implements Expression {
        private String data;

        public TerminalExpression(String data) {
            this.data = data;
        }

        public boolean interpret(String context) {
            return context.contains(data);
        }
    }

    static class OrExpression implements Expression {
        private Expression expr1;
        private Expression expr2;

        public OrExpression(Expression expr1, Expression expr2) {
            this.expr1 = expr1;
            this.expr2 = expr2;
        }

        public boolean interpret(String context) {
            return expr1.interpret(context) || expr2.interpret(context);
        }
    }

    static class AndExpression implements Expression {
        private Expression expr1;
        private Expression expr2;

        public AndExpression(Expression expr1, Expression expr2) {
            this.expr1 = expr1;
            this.expr2 = expr2;
        }

        public boolean interpret(String context) {
            return expr1.interpret(context) && expr2.interpret(context);
        }
    }

    public void demonstrate() {
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");

        Expression isJavaOrPython = new OrExpression(isJava, isPython);
        Expression isJavaAndPython = new AndExpression(isJava, isPython);

        System.out.println("Does context contain Java or Python?");
        System.out.println(isJavaOrPython.interpret("I love Java"));

        System.out.println("Does context contain both Java and Python?");
        System.out.println(isJavaAndPython.interpret("I love Java and Python"));
    }
}
