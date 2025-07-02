class Solution {
public int lengthOfLIS(int[] nums) {
    List<Integer> lis = new ArrayList<>();

    Arrays.stream(nums).forEach(num -> {
        int i = 0;
        while (i < lis.size() && lis.get(i) < num) i++;
        if (i == lis.size()) lis.add(num);
        else lis.set(i, num);
    });

    return lis.size();
}
}