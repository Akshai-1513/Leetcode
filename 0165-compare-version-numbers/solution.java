class Solution {
    public int compareVersion(String version1, String version2) {
        int v1_len = count_dot(version1);
        int v2_len = count_dot(version2);
        
        int len = v1_len > v2_len ? v1_len : v2_len;
        
        int[] v1 = array(version1, len);
        int[] v2 = array(version2, len);
        System.out.println(Arrays.toString(v1) + "      " + Arrays.toString(v2));

        for(int i = 0; i < len; i++){
            if(v1[i] < v2[i]) return -1;
            else if (v1[i] > v2[i]) return 1;
        }
        return 0;
    }

    int count_dot(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++) if(s.charAt(i) == '.') count++;
        return count;
    }

    int[] array(String s, int len){
        int nums[] = new int[len];
        int index = 0;
        int i = 0, j = 0;
        while(j < s.length()){
            if(s.charAt(j) != '.') j++;
            else{
                nums[index++] = Integer.parseInt(s.substring(i, j));
                i = j + 1;
                j++;
            }
        }
        nums[index] = Integer.parseInt(s.substring(i, j));
        return nums;
    }
}
