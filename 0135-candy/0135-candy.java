class Solution {
    public int candy(int[] ratings) {
        int subarr[] = new int[ratings.length];
        int count =0;
        for(int i =0 ; i<subarr.length;i++){
                subarr[i]=1;
        }
        // for(int i : subarr){
        //         System.out.println(i);
        // }
        // int prev = 0;
        // int count = 0;
        // if(ratings.length<2){
        //     return 1;
        // }
        // if(ratings[0]>ratings[1]){
        //     prev=1;
        //     count = 3;
        // }
        // if(ratings[0]<ratings[1]){
        //     prev=2;
        //     count = 3;
        // }
        for(int i = 1; i<ratings.length;i++){
            // count = count+prev;

            if( ratings[i]>ratings[i-1] ){
                // prev = prev+1;
                // count = count+prev;
                subarr[i]= subarr[i-1]+1;
        }else if( ratings[i]<ratings[i-1]){
        //  prev = 1;
        // count = count+prev;
        subarr[i-1]= subarr[i]+1;
        }
        // else{
            
        // }

    }
    for(int i = ratings.length-1; i>0;i--){
        if(ratings[i]>ratings[i-1]){
            subarr[i] = Math.max(subarr[i-1]+1,subarr[i]);
        }
        else if(ratings[i]<ratings[i-1] ){
            subarr[i-1] = Math.max(subarr[i]+1,subarr[i-1]);
        }
    }
    for(int arr:subarr){
        count+=arr;
    }
    // if(ratings[ratings.length-1]<ratings[ratings.length-2] && prev==1 ){
    //         prev=1;
    //         count = count+prev;
    //     }
return count;}
}