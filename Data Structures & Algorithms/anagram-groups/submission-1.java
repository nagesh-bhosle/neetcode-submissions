class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String temp = new String(charArray);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else{
                List<String> tempList = new ArrayList<>();
                tempList.add(s);
                map.put(temp,tempList);
            }
        }
         return new ArrayList<>(map.values());
    }
}
