class Solution {

    public String encode(List<String> strs) {
        StringBuilder newstr = new StringBuilder();
        for(String str : strs){
            newstr.append(str.length()).append("#").append(str);
        }
        return newstr.toString();
        
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded_strs.add(str.substring(i, j));
            i = j;
        }
        return decoded_strs;
    }
}
