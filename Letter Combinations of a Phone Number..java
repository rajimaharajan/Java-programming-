class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();

         List<String> res = new ArrayList<>();
        if(digits == null||digits.isEmpty()) {
            return res;
        }
        map.put('2', "abc");
       map.put('3', "def");
       map.put('4', "ghi");
       map.put('5', "jkl");
       map.put('6', "mno");
       map.put('7', "pqrs");
       map.put('8', "tuv");
        map.put('9', "wxyz");
        
        find(res,map,digits,0,new StringBuilder());

        return res;

    }
    public void find( List<String> res, Map<Character , String> map, String digits ,int index  ,StringBuilder sb ){
        if(index == digits.length()){
            res.add(sb.toString());

            return;
        }
        
        String letter =map.get(digits.charAt(index));

        for(int i = 0 ; i< letter.length();i++){
            sb.append(letter.charAt(i));
            find(res , map,digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

        
    }
}
