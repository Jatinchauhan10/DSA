class Solution {
    public boolean isAnagram(String s, String t) {

        char tempArrays[] = s.toCharArray();
        char tempArrayt[] = t.toCharArray();

        Arrays.sort(tempArrays);
        Arrays.sort(tempArrayt);

        // adding coment
        return Arrays.equals(tempArrays, tempArrayt);
    }
}
