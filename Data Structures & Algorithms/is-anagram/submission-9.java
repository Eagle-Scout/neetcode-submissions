class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char c : sArray) {
            if (sMap.containsKey(c)) {
                sMap.replace(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (char c : tArray) {
            if (tMap.containsKey(c)) {
                tMap.replace(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        

        return sMap.equals(tMap);
    }
}
