
public class InfixToPostfixMain {
	// Driver method  
    public static void main(String[] args)  
    { 
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(InfixToPostfix.calc(exp)); 
    } 
}
