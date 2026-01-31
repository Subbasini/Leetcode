class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a=0,b=0,i=0;
       int[] res=new int[m+n];
       while(a<m && b<n){
        if(nums1[a]<=nums2[b]){
            res[i]=nums1[a];
            i++;
            a++;
        }
        else{
            res[i]=nums2[b];
            i++; b++;
        }

       } 
       while(a<m){
        res[i]=nums1[a];
            i++;
            a++;
       }
       while(b<n){
        res[i]=nums2[b];
           i++; b++;
       }

       for(int j=0;j<res.length;j++){
        nums1[j]=res[j];
       }
    }
}