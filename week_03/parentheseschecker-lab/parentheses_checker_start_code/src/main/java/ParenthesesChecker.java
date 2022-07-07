import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {

     /* public static boolean checkParentheses(String str) {
          if (str.charAt(0) == '{')
               return false;

          Stack<Character> checkParentheses = new Stack<Character>();
          // mission for the weekend - complete this lab
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
     } */
     private Stack<Character> unmatchedCharacters;

     public ParenthesesChecker(){
          unmatchedCharacters = new Stack <>();
     }

     public boolean checkParentheses(String testString){

          List<Character> openingCharacters = Arrays.asList('(', '{', '[', '<');
          List<Character> closingCharacters = Arrays.asList(')', '}', ']', '>');

          char[] brokenString = testString.toCharArray();

          for(Character character : brokenString){
               if(openingCharacters.contains(character)){
                    unmatchedCharacters.push(character);
               }
               else if (closingCharacters.contains(character)){
                    int indexToCheck = closingCharacters.indexOf(character);
                    char correspondingOpeningCharacter = openingCharacters.get(indexToCheck);

                    if(unmatchedCharacters.isEmpty() || !unmatchedCharacters.peek().equals(correspondingOpeningCharacter)){
                         return false;
                    }
                    else {
                         unmatchedCharacters.pop();
                    }
               }
          }
          return unmatchedCharacters.isEmpty();
     }

     }


