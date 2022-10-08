//중위표기식 프로그램을 후위표기식으로 바꾸는 프로그램(중위가 사람이 쓰는방식,후위가 컴퓨터가 계산하는방식)
//infix  프로그램을  postfix로 바꾸는 프로그램

import java.util.Stack; 
  
class InfixToPostfix
{ 
	
	//밑에 메인 메소드에서 호출하는 메소드
	
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
    
    //중위표기식을 후위표기식으로 바꾸는 메인 매소드.
    
    static String calc(String exp) 
    { 
        // 비어있는 result변수 생성
        String result = new String(""); 
          
        //stack빵틀의 Character 형 변수 stack 생성
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) //입력된 exp의 문자열 길이만큼 반복
        { 
            char c = exp.charAt(i); //exp의 문자를 순차적으로 c에다가 대입
              
             // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) //문자가 아니라 숫자라면 result에다가 c를 더해라
                result += c; 
            
            else if (c == '(') //만약에 '(' 라면 스택에 넣어라.
                stack.push(c); 
              
            else if (c == ')') //만약에 ')' 라면 스택에서 '(' 나올떄까지 꺼내라
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); //스택 꺼내는거
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
