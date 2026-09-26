class Solution {
    public String removeOccurrences(String s, String part) {
    StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()) {
            ans.append(ch);
        if(ans.toString().endsWith(part)){
            ans.delete(ans.length() - part.length(), ans.length());
        }
        }
        return ans.toString();
    }
}