package _leet_code;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] example = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(example));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        String shortestWord = strs[0];
        int index = 0;
        for (String str : strs) if(shortestWord.length() > str.length()) shortestWord = str;

        for(int i = 1; i <= shortestWord.toCharArray().length; i++) {
            // 0일 때 빈 배열을 무조건 반환
            if (shortestWord == "") return result;

            int count = 0;
            for (String str : strs) {
                if(shortestWord.substring(0, i).equals(str.substring(0, i))) count++;
            }
            if(count == strs.length) index += 1;
        }
        result =shortestWord.substring(0, index);
        return result;
    }

}
