import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charWordMap = new HashMap<>();
        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length){
            return false;
        }

        for(int i=0; i<pattern.length(); i++){
            char charPat = pattern.charAt(i);
            String word = sArr[i];
            if(charWordMap.containsKey(charPat)){
                if(!word.equals(charWordMap.get(charPat))){
                    return false;
                }
            }
            else{
                if(charWordMap.containsValue(word)){
                    return false;
                }
                charWordMap.put(charPat, word);
            }

        }

        return true;

    }
}
public class WordPattern {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.wordPattern("abba", "cat dog dog cat"));
    }
}
