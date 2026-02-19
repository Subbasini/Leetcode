class Solution {
    public String convertToBase7(int num) {
        int rem=0;
        StringBuilder s=new StringBuilder();
        if(num==0){ return "0";}
        int n=num;
            num=Math.abs(num);
    
        
        while(num!=0){
            rem=num%7;
            s.append(rem);
            num=num/7;
        }
        if(n<0){
            s.append("-");
        }
        System.out.println(s);
        return s.reverse().toString();
    }
}