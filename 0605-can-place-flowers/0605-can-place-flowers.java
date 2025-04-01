class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        if(n == 0){
            return true;
        }
        if(flowerbed.length==0 && n >0){
            return false;
        }
       if(flowerbed.length==1 && n>0){
            if(flowerbed[0]==0){
                return(n==1);
            }
            else
            return false;
        }
    if(flowerbed.length>1){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                count++;
                flowerbed[0]=1;
            }
        }
        for(int i = 2 ; i<flowerbed.length-1; i++){
            if(count==n){
                return true;
            }
        if(flowerbed[i-1]!=1 && flowerbed[i]==0 && flowerbed[i+1]==0){
            count++;
            flowerbed[i]=1;
        }
        }
        if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]== 0){
                    count++;
                    flowerbed[flowerbed.length-1] =1;
                }
              
        
        //     if(i-1>0 && i+1<flowerbed.length){
        //             if(flowerbed[i-1]==0 && flowerbed[i]== 0 && flowerbed[i+1]== 0){
        //             count++;
        //             flowerbed[i] =1;
        //         }
        //         }
        //     if(flowerbed[i]==0 && flowerbed[i+1]== 0){
        //         count++;
        //     }
            
        // }
        for(int i=0;i<flowerbed.length;i++)
            System.out.println(flowerbed[i]);
        return count>=n;
    }
}