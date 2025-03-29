class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hset = new HashSet<>();
        while(!hset.contains(n)){
            hset.add(n);
            if(n==1)
            return true;
           n= returnSum(n);
        }
        return false;
    }
    public int returnSum(int n){
        int sum =0;
        while(n>0){
            sum+=(int)Math.pow(n%10,2);
            n = n/10;
        }
        return sum;
    }
}