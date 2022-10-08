//����ǥ����� ����ǥ������� �ٲ� ����ǥ����� ����ϴ� ���α׷�

import java.util.Stack;

public class UtilStack {
	// Method to evaluate value of a postfix expression
	static int calc(String exp) {
		Stack<Integer> stack = new Stack<>();
		// Scan all characters one by one
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			// If the scanned character is an operand (number here)�ǿ�����,
			// push it to the stack.
			if (Character.isDigit(c))
				stack.push(c - '0');

			// If the scanned character is an operator(������), pop two
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