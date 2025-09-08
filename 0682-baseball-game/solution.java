class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
          if(operations[i].equals("+")) {
                int sum = 0;
                for (int j = list.size() - 2; j < list.size(); j++) {
                    sum += list.get(j);
                }
                list.add(sum);
            } else if (operations[i].equals("D")) {
                list.add(list.getLast() * 2);
            } else if (operations[i].equals("C")) {
                list.removeLast();
            }
            else list.add(Integer.parseInt(operations[i]));
        }
        
        int res = 0;
        for(int i = 0 ; i < list.size(); i++) res += list.get(i);
        return res;
    }
}
