package bai1;

/**
 * lớp hình thừa kế lớp expression
 *
 * @author Nguyễn Thị Hường
 */
public class Square extends Expression {

    Expression expression;

    public Square(Expression e) {
        expression = e;
        System.out.println("Square = " + ((Numeral) e).value * ((Numeral) e).value);

    }
}
