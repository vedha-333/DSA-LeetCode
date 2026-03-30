class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0 ;
        char sign = '+';

        for (char current : (s +'+').toCharArray()){
            if (Character.isDigit(current)){
                num = num * 10 + current - '0';
            } else if (current  != ' '){
                if (sign == '+') stack.push(num);
                else if (sign == '-') stack.push(-num);
                else if (sign == '*') stack.push(stack.pop() * num);
                else if (sign == '/') stack.push(stack.pop() / num);

                sign = current ;
                num = 0 ;
            }

        }
        int res = 0 ;
        for (int x : stack){
            res += x;
        }
    return res ;

    }
}