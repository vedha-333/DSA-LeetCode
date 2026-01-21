class Solution {
    public boolean checkPerfectNumber(int num) {
        int[] perfectNumbers = {
            6, 28, 496, 8128, 33550336
        };

        for (int p : perfectNumbers) {
            if (p == num) {
                return true;
            }
        }
        return false;
    }
}
