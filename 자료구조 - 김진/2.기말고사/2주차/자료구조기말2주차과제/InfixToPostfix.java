//����ǥ��� ���α׷��� ����ǥ������� �ٲٴ� ���α׷�(������ ����� ���¹��,������ ��ǻ�Ͱ� ����ϴ¹��)
//infix  ���α׷���  postfix�� �ٲٴ� ���α׷�

import java.util.Stack; 
  
class InfixToPostfix
{ 
	
	//�ؿ� ���� �޼ҵ忡�� ȣ���ϴ� �޼ҵ�
	
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
    
    //����ǥ����� ����ǥ������� �ٲٴ� ���� �żҵ�.
    
    static String calc(String exp) 
    { 
        // ����ִ� result���� ����
        String result = new String(""); 
          
        //stack��Ʋ�� Character �� ���� stack ����
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) //�Էµ� exp�� ���ڿ� ���̸�ŭ �ݺ�
        { 
            char c = exp.charAt(i); //exp�� ���ڸ� ���������� c���ٰ� ����
              
             // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) //���ڰ� �ƴ϶� ���ڶ�� result���ٰ� c�� ���ض�
                result += c; 
            
            else if (c == '(') //���࿡ '(' ��� ���ÿ� �־��.
                stack.push(c); 
              
            else if (c == ')') //���࿡ ')' ��� ���ÿ��� '(' ���Ë����� ������
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); //���� �����°�
            } 
            
            else // an operator is encountered 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) 
                    result += stack.pop(); 
                stack.push(c); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()) 
            result += stack.pop(); 
       
        return result; 
    } 
    
    
} 
