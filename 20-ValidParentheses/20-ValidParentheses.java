// Last updated: 7/9/2026, 3:14:43 PM
class Solution {
    public boolean isValid(String s) {
        char[]ch=s.toCharArray();
        Stack<Character>Stack=new Stack<>();
        for(char c:ch){
            if(c=='('||c=='['||c=='{')
            Stack.push(c);
            else{
                if(Stack.empty()) return false;
                    else if(c==')'&& Stack.peek()=='(')
                      Stack.pop();
                    else if(c==']'&& Stack.peek()=='[')
                      Stack.pop();
                      else if(c=='}'&&Stack.peek()=='{')
                      Stack.pop();
                else return false;}

        }
        return Stack.empty();
        
        
    }
}