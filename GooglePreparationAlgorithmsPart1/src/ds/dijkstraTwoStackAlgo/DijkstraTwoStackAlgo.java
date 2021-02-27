package ds.dijkstraTwoStackAlgo;

import java.util.Stack;

public class DijkstraTwoStackAlgo {
    Stack<String> valueStack = new Stack<>();
    Stack<String> operatorStack = new Stack<>();

    public int evaluateExpression(String expression) {
        int index = 0;
        while (index < expression.length()) {
            String character = String.valueOf(expression.charAt(index));
            if (character.matches("[0-9]{1}")) {
                valueStack.push(character);
            } else if (character.equals(")")) {
                int value1 = Integer.parseInt(valueStack.pop());
                int value2 = Integer.parseInt(valueStack.pop());
                String operator = operatorStack.pop();
                int result = calculate(operator, value1, value2);
                valueStack.push(String.valueOf(result));
            } else if (character.matches("[*/+-]{1}")) {
                operatorStack.push(character);
            }
            index++;
        }
        return Integer.parseInt(valueStack.pop());
    }

    private int calculate(String operator, int value1, int value2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value2 - value1;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value2 / value1;
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "(1+((2+3)*(4*5)))";
        DijkstraTwoStackAlgo algo = new DijkstraTwoStackAlgo();
        System.out.println(algo.evaluateExpression(expression));
    }
}
