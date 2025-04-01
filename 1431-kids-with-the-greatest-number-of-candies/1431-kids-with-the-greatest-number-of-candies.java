class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> TF = new ArrayList<Boolean>();
        int max =0;
        int arr[] = new int[candies.length];
        // arr = candies;
        System.arraycopy(
                        candies,   // From the first array
                        0,       // Starting from the first element
                        arr,  // To the second array
                        0,       // Starting at the first element
                        candies.length        // Copy all elements
                        );

        Arrays.sort(arr);
        max = arr[arr.length-1];
        // System.out.println(max);
        for(int i = 0; i< candies.length; i++){
            System.out.println(candies[i]);
            if(candies[i]+extraCandies>=max){
                // max = candies[i];
                TF.add(true);
                // System.out.println(arr[i]);
            }
            else{
                // max = candies[i]+extraCandies;
                TF.add(false);
            }
        }
        return TF;
    }
}