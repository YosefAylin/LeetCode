class Solution {
    public boolean doesAliceWin(String s) {
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o') {
                return true;
            }
        }
        return false;
    }
}