class Solution {
    public boolean isValid(String s) {
        Stack stack=new Stack();
        if(s==null||s.length()%2==1)
        return false;
        else
        {
              for (char c : s.toCharArray())
            {
                
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else{
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=(char)stack.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) 
                {
                    return false;
                }
                }

            }
            
        }
        return stack.isEmpty();
    }
}
