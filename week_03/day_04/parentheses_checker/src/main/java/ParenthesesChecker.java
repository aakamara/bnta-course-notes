import java.util.Stack;

public class ParenthesesChecker {

    public static boolean checkParentheses(String str) {
        if (str.charAt(0) == '{')
            return false;

        Stack<Character> checkParentheses = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                checkParentheses.push(c);
            else if(c == '{')
                checkParentheses.push(c);
            else if(c == ')')
                if(checkParentheses.empty())
                    return false;
                else if(checkParentheses.peek() == '(')
                    checkParentheses.pop();
                else
                    return false;
            else if(c == '}')
                if(checkParentheses.empty())
                    return false;
                else if(checkParentheses.peek() == '{')
                    checkParentheses.pop();
                else
                    return false;
        }
        return checkParentheses.empty();
    }

}
