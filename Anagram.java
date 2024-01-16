class Solution {
    public boolean isAnagram(String s, String t) {

        char tempArrays[] = s.toCharArray();
        char tempArrayt[] = t.toCharArray();

        Arrays.sort(tempArrays);
        Arrays.sort(tempArrayt);

        
        return Arrays.equals(tempArrays, tempArrayt);
    }
}
