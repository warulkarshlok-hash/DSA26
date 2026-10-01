class Solution {
    public boolean isValid(String s) {

    // Using stack but comparitively low
    // Stack<Character> stack = new Stack<>();
    // for(char ch : s.toCharArray()){
    //         if(ch=='(' || ch=='{' || ch=='['){
    //             stack.push(ch);
    //         }
    //         else{
    //             if(stack.isEmpty()){
    //                 return false;
    //             }

    //             char top  = stack.pop();

    //             if(ch==')' && top !='('){
    //                 return false;
    //             }
    //             if(ch=='}' && top !='{'){
    //                 return false;
    //             }
    //             if(ch==']' && top !='['){
    //                 return false;
    //             }
                

    //         }
    //     }
    //     return stack.isEmpty();
    // }

        char[] stack = new char[s.length()];

        int top = -1;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                top++;
                stack[top] = ')';
            }
            else if(ch=='{'){
                top++;
                stack[top] = '}';
            }
            else if(ch=='['){
                top++;
                stack[top] = ']';
            }
            else{
                if(top==-1 || stack[top] != ch){
                    return false;
                }
                top--;
            }
        }
        return top==-1;
    }
}