class Solution {
    public String decodeString(String s) {
        Stack<Integer> repeatStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNumber = 0;

        for (char ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                currentNumber = currentNumber * 10 + (ch - '0');
            }else if (ch == '['){
                repeatStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber = 0;
                currentString = "";
            }else if (ch == ']'){
                int repeatNumber = repeatStack.pop();
                String previous = stringStack.pop();

                currentString = previous + currentString.repeat(repeatNumber);
            }else {
                currentString += ch;
            }
        }
        return currentString ;
    }
}