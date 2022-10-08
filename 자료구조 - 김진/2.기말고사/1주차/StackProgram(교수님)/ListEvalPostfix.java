
class ListEvalPostfix {

	// Method to evaluate value of a postfix expression
	static int calc(String exp) {
		ListStack<Integer> arrayStack1 = new ListStack<>();
		// Scan all characters one by one
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			// If the scanned character is an operand (number here)피연산자,
			// push it to the stack.
			if (Character.isDigit(c))
				arrayStack1.push(c - '0');

			// If the scanned character is an operator(연산자), pop two
			// elements from stack apply the operator
			else {
				int val1 = arrayStack1.pop();
				int val2 = arrayStack1.pop();

				switch (c) {
				case '+':
					arrayStack1.push(val2 + val1);
					break;

				case '-':
					arrayStack1.push(val2 - val1);
					break;

				case '/':
					arrayStack1.push(val2 / val1);
					break;

				case '*':
					arrayStack1.push(val2 * val1);
					break;
				}
			}
		}
		return arrayStack1.pop();
	}
}
