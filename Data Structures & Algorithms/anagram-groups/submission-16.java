class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            /* 
            1st solution

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            */

            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }



        return new ArrayList<>(map.values());


    }
}
