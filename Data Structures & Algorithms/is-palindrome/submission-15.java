class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^\\p{Alpha}\\p{Digit}]+", "");

        System.out.println(str + "\n" + s);

        int i = 0;
        int j = str.length() - 1;
        while (i < (str.length()) / 2) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                System.out.println(str.charAt(i) + "/" + str.charAt(j));
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
