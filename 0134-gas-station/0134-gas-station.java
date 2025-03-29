class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas=0;
      for(int i=0 ;i<gas.length;i++){
        sumGas+=gas[i];
      }
      int sumCost=0;
      for(int i=0 ;i<cost.length;i++){
        sumCost+=cost[i];
      }
      if(sumGas<sumCost){
        return -1;
      }
    sumGas =0;
    int start =0;
    int i=0;
    while(i<gas.length){
        sumGas+=gas[i]-cost[i];
        if(sumGas<0){
            start = i+1;
            sumGas = 0;
            // i = start;
            // break;
        }
        
        
        i++;
    } 
    return start;
    }
}