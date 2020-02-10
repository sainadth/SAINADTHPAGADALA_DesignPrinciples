package calculator;


public class CalculatorOperations {
    public static double evaluateExpression(double number1, double number2, char operator){
        switch(operator){
            case '+': return number1+number2;
            case '-': return number1-number2;
            case '*': return number1*number2;
            case '/': return number1/number2;
            case '%': return number1%number2;
            default: throw new Error("Invalid Operator");
        }
    }
}
