class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        String[] temp = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            temp[i] = new String(tempArray);
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != "##") {
                List<String> tempList = new ArrayList<>();
                for (int j = i; j < strs.length; j++) {
                    if (temp[i].equals(temp[j])) {
                        tempList.add(strs[j]);
                        strs[j] = "##";
                    }
                }
                resultList.add(tempList);
            }
        }

        return resultList;
    }
}
