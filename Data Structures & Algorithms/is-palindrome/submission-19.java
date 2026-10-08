class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^\\p{Alpha}\\p{Digit}]+", "");

        int i = 0;
        int j = str.length() - 1;
        while (i < (str.length()) / 2) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
