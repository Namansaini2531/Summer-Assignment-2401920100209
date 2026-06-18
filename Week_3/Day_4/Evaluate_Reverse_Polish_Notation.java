import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
      
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") ||token.equals("*") || token.equals("/")) {

                int b = stack.pop(); // second operand (pehele push hoga)
                int a = stack.pop(); // first operand (baad me hoga)
              
                int result = 0;

                switch(token) {
                    case "+": {
                        result = a + b;
                        break;
                    }
                    case "-": {
                        result = a - b;
                        break;
                    }
                    case "*": {
                        result = a * b;
                        break;
                    }
                    case "/": {
                        result = a / b;
                        break;
                    }
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
