class Solution {
    public String encode(List<String> strs) {
        List<String> temp = new ArrayList<>();
        if (strs.size() == 0) {
            return "";
        }
        for (String s : strs) {
            if (s.equals("")) {
                temp.add("EMPTY");
            } else {
                temp.add(s);
            }
        }
        return temp.stream().collect(Collectors.joining("SEPERATOR"));
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str.equals(""))
            return result;
        List<String> temp = Arrays.asList(str.split("SEPERATOR"));

        for (String s : temp) {
            if (s.equals("EMPTY")) {
                result.add("");
            } else {
                result.add(s);
            }
        }
        return result;
    }
}
