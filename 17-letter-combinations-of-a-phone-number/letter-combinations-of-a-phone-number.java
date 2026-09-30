class Solution {
    public static void solve(String digits, int idx, String[] mapping, List<String> result, StringBuilder output){
        if(idx>=digits.length()){
            result.add(output.toString());
            return;
        }
        
        int value = digits.charAt(idx)-'0';
        String mappedString = mapping[value];


        for(int i=0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            solve(digits, idx+1, mapping, result, output);
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        int idx = 0;
        StringBuilder output = new StringBuilder();
        solve(digits, idx, mapping, result, output);
        return result;
    }
}