class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        int sum=0;
        int n=code.length;
        if (k == 0) {
            return new int[n];
        }
        if(k<0){
            k = -k;
            for (int i=1;i<= k;i++) {
                sum+=code[(n-i)%n];
            }
            for (int i = 0;i<n;i++) {
                res[i]=sum;
                sum-=code[(i-k+n) % n];
                sum+=code[i];
        }
        }
        else {
            for (int i=1;i<=k;i++) {
                sum += code[i%n];
            }
            for (int i=0;i<n;i++) {
                res[i] = sum;
                sum -=code[(i+1) % n];
                sum +=code[(i+k+1)%n];
            }
        }
        return res;
    }
}