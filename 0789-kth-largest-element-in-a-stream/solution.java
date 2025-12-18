class KthLargest {
    ArrayList<Integer> list;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.list = new ArrayList<>();
        for(int i : nums) list.add(i);
        this.k = k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
