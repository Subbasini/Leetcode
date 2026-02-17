class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> l=new ArrayList<>();
       if(s.length()<p.length()){
            return l;
       } 
       int[] p_arr=new int[26];
       int[] s_arr=new int[26];

       for(char c:p.toCharArray()){
        p_arr[c-'a']++;
       }
       for(int i=0;i<s.length();i++){
        s_arr[s.charAt(i)-'a']++;
       
       
        if (i >= p.length()) {
            s_arr[s.charAt(i - p.length()) - 'a']--;
         }
       if(Arrays.equals(s_arr,p_arr)){
        l.add(i-p.length()+1);
       }
       }
       return l;
    }
}