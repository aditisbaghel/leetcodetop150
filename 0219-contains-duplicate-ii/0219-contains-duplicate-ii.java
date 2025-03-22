class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int j=0;
        for(int i : nums){
            if(hmap.containsKey(i)){
                if(Math.abs(hmap.get(i)-j)<=k){
                    return true;
                }
                hmap.put(i,j);
            }
            else
            hmap.put(i,j);
            j++;
        }
        return false;
    }
}