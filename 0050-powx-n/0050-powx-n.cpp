class Solution {
public:
    double myPow(double x, int n) {
       double res = 1.0;
       long long ex=n;
        if (ex < 0) {
            x = 1 / x;
            ex = -ex;
        }

     while(ex>0){
        if(ex % 2 == 1){
            res*=x;
        } x*=x;
         ex/=2;
     }
       return res;
    }
};