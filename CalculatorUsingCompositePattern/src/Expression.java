public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int result = 0;
        int leftExpressionEvaluation = leftExpression.evaluate();
        int rightExpressionEvaluation = rightExpression.evaluate();
        switch (operation) {
            case ADD:
                result = leftExpressionEvaluation + rightExpressionEvaluation;
                break;
            case SUBTRACT:
                result = leftExpressionEvaluation - rightExpressionEvaluation;
                break;
            case MULTIPLY:
                result = leftExpressionEvaluation * rightExpressionEvaluation;
                break;
            case DIVIDE:
                result = leftExpressionEvaluation / rightExpressionEvaluation;
                break;
            default:
                result = 0;

        }
        return result;
    }
}
