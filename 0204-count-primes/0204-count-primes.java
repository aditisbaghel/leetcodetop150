class Solution {
    public int countPrimes(int n) {
        boolean []arr = new boolean[n];
        Arrays.fill(arr, true);
        int count=0;
        if(n<=2)return 0;
        for(int i=2;i*i<n;i++){
            if(arr[i]){
            for(int j=i*i;j<n;j=j+i){
                arr[j]=false;
            }}
        } 
        for(int i=2;i<n;i++){
            if(arr[i])
                count++;
        }      
        return count;
}}