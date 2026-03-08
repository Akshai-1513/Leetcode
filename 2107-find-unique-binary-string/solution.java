class Solution {

    List<String> list = new ArrayList<>();

    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        coin(n, "");
        for(String i : nums){
            list.removeIf(j -> j.equals(i));
        }
        return list.get(0);
    }

    void coin(int n, String current) {
        if(n == 0){
            list.add(current);
            return;
        }

        coin(n - 1, current + "1");
        coin(n - 1, current + "0");
    }
}
