class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U');
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount > 0;
    }

}