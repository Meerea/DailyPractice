package DSAToSolve;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*Find if a given paranthesis is valid or not
        eg. String input = "({[]})";
        boolean output = true;

 */
public class Parantheses {

    @Test
    public void test1(){
        String s="{([{}})}";
        System.out.println(findValidBraceses(s));
    }

    private boolean findValidBraceses(String s){
        char[] ch= s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])) {
                if (stack.isEmpty() || stack.pop() != map.get(ch[i])) {
                    return false;
                }
            }
                else{
                    stack.push(ch[i]);
                }
            }
        return stack.isEmpty();

    }
}
