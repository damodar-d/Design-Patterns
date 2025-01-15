//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//                 *
//                / \
//               3    +
//                   /\
//                  3  7

        ArithmeticExpression three = new Number(3);
        ArithmeticExpression four = new Number(4);
        ArithmeticExpression expression = new Expression(three,four,Operation.ADD);
        ArithmeticExpression expression1 = new Expression(three, expression, Operation.MULTIPLY);
        System.out.println(expression.evaluate());
        System.out.println(expression1.evaluate());
    }
}