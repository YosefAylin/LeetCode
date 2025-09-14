class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> sumVowels = new HashMap<>(5);
        HashMap<Character, Integer> sumOthers = new HashMap<>(21);

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sumVowels.put(c, sumVowels.getOrDefault(c, 0) + 1);
            } else {
                sumOthers.put(c, sumOthers.getOrDefault(c, 0) + 1);
            }
        }
        int maxVowels = sumVowels.isEmpty() ? 0 : Collections.max(sumVowels.values());
        int maxOthers = sumOthers.isEmpty() ? 0 : Collections.max(sumOthers.values());
        return maxVowels + maxOthers;
    }
    public boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}