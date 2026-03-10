class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res = new ArrayList<>();
        for(int i : bulbs){
            if(res.contains(i)) res.removeIf(n -> n == i);
            else res.add(i);
        }
        return res.stream().sorted().collect(Collectors.toList());
    }
}
