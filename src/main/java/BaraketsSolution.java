import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BaraketsSolution {
    public static void main(String[] args) {
        System.out.println(isBalanced("}([[{)[]))]{){}["));
    }


    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        String BALANCED = "YES";
        String NOT_BALANCED = "NO";
        Stack<Character> characterStack = new Stack<>();
        Map<Character, Character> bracketsTable = new HashMap<>();
        bracketsTable.put(')', '(');
        bracketsTable.put(']', '[');
        bracketsTable.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            try {
                Character character = s.charAt(i);
                switch (character) {
                    case '{':
                    case '(':
                    case '[':
                        characterStack.push(character);
                        break;
                    default:
                        Character tableValue = bracketsTable.get(character);
                        Character bracketInStack = characterStack.pop();
                        if (tableValue == null || bracketInStack == null)
                            return NOT_BALANCED;
                        if ((!tableValue.equals(bracketInStack)))
                            return NOT_BALANCED;

                }
            } catch (Exception e) {
                return NOT_BALANCED;
            }
        }
        return BALANCED;
    }

}
