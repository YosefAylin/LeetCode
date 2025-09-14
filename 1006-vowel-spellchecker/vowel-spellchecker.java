class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            vowelInsensitive.putIfAbsent(devowel(lower), word);
        }

        String[] answer = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exactWords.contains(q)) {
                answer[i] = q;
                continue;
            }

            String lower = q.toLowerCase();
            if (caseInsensitive.containsKey(lower)) {
                answer[i] = caseInsensitive.get(lower);
                continue;
            }

            String dev = devowel(lower);
            if (vowelInsensitive.containsKey(dev)) {
                answer[i] = vowelInsensitive.get(dev);
                continue;
            }

            answer[i] = "";
        }

        return answer;
    }

    private String devowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
