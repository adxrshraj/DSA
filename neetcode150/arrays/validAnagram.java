class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String s_sorted = new String(arr);

        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);

        String t_sorted = new String(arr1);

        return s_sorted.equals(t_sorted);



    }
}