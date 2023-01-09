package _leet_code.arrayNstring.example;

public class ImplementStrStr {
    public static void main(String[] args) {
        String hayStack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(hayStack, needle));
        String hayStack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(hayStack2, needle2));
    }

    public static int strStr(String haystack, String needle) {
        int position = haystack.indexOf(needle);
        return position;
    }
}
