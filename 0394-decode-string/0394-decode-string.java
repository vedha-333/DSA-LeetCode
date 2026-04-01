class Solution {
    public String decodeString(String s) {
        Stack<Integer> repeatStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNumber = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                repeatStack.push(currentNumber);
                stringStack.push(currentString);

                currentString = "";
                currentNumber = 0;
            } 
            else if (ch == ']') {
                int repeatTimes = repeatStack.pop();
                String previousString = stringStack.pop();

                currentString = previousString + currentString.repeat(repeatTimes);
            } 
            else {
                currentString += ch;
            }
        }
        return currentString;
    }
}