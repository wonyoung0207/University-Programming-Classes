//중위표기식을 후위표기식으로 바꿔 후위표기식을 계산하는 프로그램

import java.util.Stack;

public class UtilStack {
	// Method to evaluate value of a postfix expression
	static int calc(String exp) {
		Stack<Integer> stack = new Stack<>();
		// Scan all characters one by one
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			// If the scanned character is an operand (number here)피연산자,
			// push it to the stack.
			if (Character.isDigit(c))
				stack.push(c - '0');

			// If the scanned character is an operator(연산자), pop two
			// elements from stack apply the operator
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;

				case '-':
					stack.push(val2 - val1);
					break;

				case '/':
					stack.push(val2 / val1);
					break;

				case '*':
					stack.push(val2 * val1);
					break;
				}
			}
		}
		return stack.pop();
	}
}