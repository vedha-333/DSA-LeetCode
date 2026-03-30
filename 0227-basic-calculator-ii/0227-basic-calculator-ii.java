class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char sign = '+';

        for (char c : (s + "+").toCharArray()) {
            if (Character.isDigit(c)) num = num * 10 + c - '0';

            else if (c != ' ') {
                if (sign == '+') st.push(num);
                else if (sign == '-') st.push(-num);
                else if (sign == '*') st.push(st.pop() * num);
                else st.push(st.pop() / num);

                sign = c;
                num = 0;
            }
        }

        int res = 0;
        for (int x : st) res += x;
        return res;
    }
}