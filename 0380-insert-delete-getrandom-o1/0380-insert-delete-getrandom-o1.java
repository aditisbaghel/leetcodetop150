class RandomizedSet {
    Set<Integer> val;
    public RandomizedSet() {
        val = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(this.val.contains(val)){
            return false;
        }
        this.val.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(this.val.contains(val)){
            this.val.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<>(val);
        int rand = (int)(Math.random()*val.size());
        return list.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */