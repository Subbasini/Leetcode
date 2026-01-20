class Solution {
    public boolean isValid(String s) {
       Stack<Character>stack=new Stack<>();
       char[] a=s.toCharArray();
       for(int i=0;i<a.length;i++){
        if(a[i]=='(' || a[i]=='{' || a[i]=='['){
            stack.push(a[i]);
        }
        else{
            if(stack.isEmpty()==false){
                if(a[i]==')' && stack.peek()=='(' ||a[i]==']' && stack.peek()=='['||a[i]=='}' && stack.peek()=='{'  ){
                    stack.pop();
                }
                else{
                return false;}

            }
            else{
                return false;
            }
            }}
        if(stack.isEmpty())
            return true;
        return false;
       }
    }
